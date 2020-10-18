package port

import (
	"fmt"
	"net"
	"sort"
	"time"
)

func worker(address string, protocol string, ports, results chan int) {
	for port := range ports {
		host := fmt.Sprintf("%s:%d", address, port)
		conn, err := net.Dial(protocol, host)
		if err != nil {
			results <- 0
			continue
		}
		conn.Close()
		results <- port
	}
}

func CommonScan(address string, protocol string, numWorkers int) {
	ports := make(chan int, numWorkers)
	results := make(chan int)
	var openports []int

	fmt.Println("Scanning...")
	start := time.Now()

	for i := 0; i < cap(ports); i++ {
		go worker(address, protocol, ports, results)
	}

	go func() {
		for i := 1; i <= 1024; i++ {
			ports <- i
		}
	}()

	for i := 0; i < 1024; i++ {
		port := <-results
		if port != 0 {
			openports = append(openports, port)
		}
	}

	close(ports)
	close(results)
	sort.Ints(openports)
	for _, port := range openports {
		fmt.Printf(" %d [Open] -> %s \n", port, predictPort(port))
	}
	duration := time.Since(start)
	fmt.Println("\nFinished in ", duration)
}

func WideScan(address string, protocol string, numWorkers int) {
	ports := make(chan int, numWorkers)
	results := make(chan int)
	var openports []int

	fmt.Println("Scanning...")
	start := time.Now()

	for i := 0; i < cap(ports); i++ {
		go worker(address, protocol, ports, results)
	}

	go func() {
		for i := 1; i <= 65535; i++ {
			ports <- i
		}
	}()

	for i := 0; i < 65535; i++ {
		port := <-results
		if port != 0 {
			openports = append(openports, port)
		}
	}

	close(ports)
	close(results)
	sort.Ints(openports)
	for _, port := range openports {
		fmt.Printf(" %d [Open] -> %s \n", port, predictPort(port))
	}

	duration := time.Since(start)
	fmt.Println("\nFinished in ", duration)
}

var knownPorts = map[int]string{
	27017: "mongodb [ http://www.mongodb.org/ ]",
	28017: "mongodb web admin [ http://www.mongodb.org/ ]",
	21:    "ftp",
	22:    "SSH",
	23:    "telnet",
	25:    "SMTP",
	66:    "Oracle SQL*NET?",
	69:    "tftp",
	80:    "http",
	88:    "kerberos",
	109:   "pop2",
	110:   "pop3",
	123:   "ntp",
	137:   "netbios",
	139:   "netbios",
	443:   "https",
	445:   "Samba",
	631:   "cups",
	5800:  "VNC remote desktop",
	194:   "IRC",
	118:   "SQL service?",
	150:   "SQL-net?",
	1433:  "Microsoft SQL server",
	1434:  "Microsoft SQL monitor",
	3306:  "MySQL",
	3396:  "Novell NDPS Printer Agent",
	3535:  "SMTP (alternate)",
	554:   "RTSP",
	9160:  "Cassandra [ http://cassandra.apache.org/ ]",
}

func predictPort(port int) string {
	if rv, ok := knownPorts[port]; ok {
		return rv
	}
	return "UNKNOWN"
}
