import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		try {
			
			ServerSocket s=new ServerSocket(1004);
			Socket con=s.accept();
			
			/// c5-----p2 lien TCP 		
			ObjectInputStream in =new ObjectInputStream(con.getInputStream());
			String m= (String) in.readObject();
			System.err.println(m);
			//partie P1 ---- P2 socket
			con=s.accept();
			in =new ObjectInputStream(con.getInputStream());
			String n= (String) in.readObject();
			System.err.println(n);
			//lecture de m par clavier  
			//System.out.println("donner M :");
			//	String m=sc.next();
			



//partie p2----p3 UDP
			DatagramSocket client =new DatagramSocket();
			InetAddress addIP= InetAddress.getByName("Localhost");
				byte send []=new byte[100];
				byte recive []=new byte[100];
				byte recive2 []=new byte[100];
				byte recive3 []=new byte[100];
				
			send=n.getBytes();
			
			DatagramPacket SendP=new DatagramPacket(send,send.length,addIP,1005);
			
			client.send(SendP);
			
			recive=m.getBytes();
			
			DatagramPacket SendP2=new DatagramPacket(recive,recive.length,addIP,1005);
			
			client.send(SendP2);

			
			DatagramPacket reciveP1=new DatagramPacket(recive2, recive2.length);
			client.receive(reciveP1); 	
			String valeur =new String(reciveP1.getData());
		
			reciveP1=new DatagramPacket(recive3, recive3.length);
			client.receive(reciveP1); 	
			String valeur2=new String(reciveP1.getData());
		
			System.err.println(valeur+"          0"+valeur2);
			
			
//p2--p1			
			ObjectOutputStream out =new ObjectOutputStream(con.getOutputStream());
			out.writeObject(valeur);
			out.writeObject(valeur2);

		
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
