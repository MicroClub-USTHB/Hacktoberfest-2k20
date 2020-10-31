import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class p1  extends java.rmi.server.UnicastRemoteObject implements IP1 {

	
	protected p1() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dataC5ToP1(double d) throws Exception {
		
	String n = null;
		
		Scanner sc=new Scanner(System.in);
		Socket c=new Socket("localhost", 1004);
		
		//lecteur de n par clavier 
		//System.out.println("donner n :");
		//String n=sc.next();
		
		//envoi des donnée 
		n=Double.toString(d);
		ObjectOutputStream out =new ObjectOutputStream(c.getOutputStream());
		out.writeObject(n);

		ObjectInputStream in =new ObjectInputStream(c.getInputStream());
		String val= (String) in.readObject();
		String val2= (String) in.readObject();
			System.out.println(val+"  "+val2);

			
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// 
	try {
/*/// c5-----p1 lien TCP 		
		DatagramSocket serveur =new DatagramSocket(9876);
		byte send []=new byte[100];
		byte recive []=new byte[100];

	DatagramPacket reciveP=new DatagramPacket(recive, recive.length);
	
		serveur.receive(reciveP); 	
	
		String v=new String(reciveP.getData());
		String n=v.trim();
		System.out.println(n);
		
		//p1-----p2
		Socket c=new Socket("localhost", 1004);

		ObjectOutputStream out =new ObjectOutputStream(c.getOutputStream());
		out.writeObject(n);

		
		//retour
	
		ObjectInputStream in =new ObjectInputStream(c.getInputStream());
		String val= (String) in.readObject();
		String val2= (String) in.readObject();
		System.out.println(val+"  "+val2);
	
	*/
		p1 s=new p1();
		Registry reg =LocateRegistry.createRegistry(9876);
		reg.rebind("SD",s);

		
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
