import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class c5 {
    public static void multi(String pr){
	
	for (int i = 1; i < 11; i++) {
		System.out.println(i+"*"+pr+"="+Integer.parseInt(pr)*i   );
	}
}
	public static Double fac(String s){
		Double fact=(double) 1;
		for (int i = 1; i <=Integer.parseInt(s) ; i++) {
			fact*=i;
		}
	return fact;

}
	public static int sommeD(String pr){
		
		int sd=0;
		for (int i = 1; i <Integer.parseInt(pr); i++) {
			if(Integer.parseInt(pr)%i==0)
				sd+=i;
			}
return sd;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pr,s;
    	Double fact;
		int sd; 
		try {
					
					ServerSocket s5 =new ServerSocket(2007);
					
					System.err.println("waiting c5...");
					
					Socket con = s5.accept();
					
					System.err.println("connected..");
					
					ObjectInputStream in=new ObjectInputStream(con.getInputStream());
					
					s=(String) in.readObject();
					pr=(String) in.readObject();
					
					multi(pr);				
					
					fact=fac(s);
					
					sd=sommeD(pr);
		        
					Socket c5=new Socket("localhost",2006);
					
					ObjectOutputStream out=new ObjectOutputStream(c5.getOutputStream());
					out.writeObject(Integer.toString(sd));
					out.writeObject(s);
					out.writeObject(Double.toString(fact));
		
					//c5---p2
					//c5---p2
					/*DatagramSocket client2 =new DatagramSocket();
					InetAddress addIP= InetAddress.getByName("Localhost");
					
					byte send2 []=new byte[100];
						byte recive2 []=new byte[100];
						String m=Integer.toString(sd);
						send2=m.getBytes();
					
					DatagramPacket SendP2=new DatagramPacket(send2,send2.length,addIP,1007);
					
					client2.send(SendP2);*/

					//c5-----p1 
				Registry reg=LocateRegistry.getRegistry("127.0.0.1",9876);
					IP1 ip=(IP1) reg.lookup("SD");
					
					ip.dataC5ToP1(fact);
System.err.println("ok bb p1! ");
					
					//c5 ----p2		UDP
					DatagramSocket client2 =new DatagramSocket();
					byte send2 []=new byte[100];
					byte recive2 []=new byte[100];
					String m=Integer.toString(sd);
					send2=m.getBytes();
					InetAddress addIP= InetAddress.getByName("Localhost");
					
				DatagramPacket SendP2=new DatagramPacket(send2,send2.length,addIP,9888);
				
				client2.send(SendP2);
				System.err.println("ok bb p2! ");				

				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				}

	}

}
