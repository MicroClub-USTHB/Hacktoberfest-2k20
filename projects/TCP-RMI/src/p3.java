import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class p3 {

	public static int divSomme(double a){
		int somme=0;
		for (int i = 1; i < a; i++) {
			if(a%i==0)
				somme+=i;
			
		}
		return somme;
	}
	
	public static String amicaux(double a ,int b){
		String val;
		if((divSomme(a)==b)&& (divSomme(b)==a))
			val=a+" et "+b+" sont amicaux";
		else
			val=a+" et "+b+" ne sont pas amicaux";
		return val;
	}
	

	public static void main(String[] args) throws NumberFormatException, Exception {
		// TODO Auto-generated method stub

		/// p2---p3
		DatagramSocket serveur =new DatagramSocket(1005);
			byte send []=new byte[10];
			byte recive []=new byte[10];

		DatagramPacket reciveP=new DatagramPacket(recive, recive.length);
		
		serveur.receive(reciveP); 	
		
		String n=new String(reciveP.getData());
		
		DatagramPacket reciveP2=new DatagramPacket(send, send.length);

		serveur.receive(reciveP2); 	
		
		String m=new String(reciveP2.getData());
		
		System.out.println("m=="+m.trim()+"n=="+n.trim());
		InetAddress addrIP=reciveP2.getAddress();
		int port =reciveP2.getPort();
		
		
		
		System.out.println(m+"+"+n+"="+(Integer.parseInt(m.trim())+Double.parseDouble(n.trim())));

		
/// p3----p4

		Registry reg=LocateRegistry.getRegistry("127.0.0.1",1006);
		IP4 ip=(IP4) reg.lookup("SD");
		ip.data(Double.parseDouble(n.trim()),Integer.parseInt(m.trim()));
		ip.seta(Double.parseDouble(n.trim()));
		ip.setb(Integer.parseInt(m.trim()));
		String valeur=ip.cube(Double.parseDouble(n.trim()),Integer.parseInt(m.trim())); 		
		//retour
			// p3 ---- p2
			byte sendp2 []=new byte[100];
			byte sendp22 []=new byte[100];
			
			sendp2=valeur.getBytes();
			DatagramPacket recivep3P2=new DatagramPacket(sendp2, sendp2.length,addrIP,port);
	    	serveur.send(recivep3P2);
	    	
	    	sendp22=amicaux(Double.parseDouble(n.trim()),Integer.parseInt(m.trim())).getBytes();
			recivep3P2=new DatagramPacket(sendp22, sendp22.length,addrIP,port);
	    	serveur.send(recivep3P2);
		
		
		
	}

}
