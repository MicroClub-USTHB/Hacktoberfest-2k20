package main

import (
	"log"
	"strconv"

	"github.com/MarouaneBouaricha/goscany/port"
	"github.com/leaanthony/clir"
)

func main() {
	var host string
	var protocol string
	var workers string

	cli := clir.NewCli("gscany", "Fast Port Scanner CLI", "v0.0.1")
	basic := cli.NewSubCommand("basic", "Scan for well known ports (1-1024)")
	wide := cli.NewSubCommand("wide", "Scan for all ports")

	basic.StringFlag("host", "Your Host/Ip ", &host)
	basic.StringFlag("p", "Protocol used TCP/UDP", &protocol)
	basic.StringFlag("n", "Number of workers (Conccurent threads -- Default 250) ", &workers)

	basic.Action(func() error {
		var num int
		if host == "" || protocol == "" {
			basic.PrintHelp()
			return nil
		}
		if workers == "" {
			workers = "250"
			num, _ = strconv.Atoi(workers)
		} else {
			num, _ = strconv.Atoi(workers)
		}
		port.CommonScan(host, protocol, num)
		return nil
	})

	wide.StringFlag("host", "Your Host/Ip ", &host)
	wide.StringFlag("p", "Protocol used TCP/UDP", &protocol)
	wide.StringFlag("n", "Number of workers (Conccrent threads  -- Default 250)", &workers)

	wide.Action(func() error {
		var num int
		if host == "" || protocol == "" {
			basic.PrintHelp()
			return nil
		}
		if workers == "" {
			workers = "250"
			num, _ = strconv.Atoi(workers)
		} else {
			num, _ = strconv.Atoi(workers)
		}
		port.WideScan(host, protocol, num)
		return nil
	})

	cli.Action(func() error {
		cli.PrintHelp()
		return nil
	})
	err := cli.Run()
	if err != nil {
		log.Fatal(err)
	}

}
