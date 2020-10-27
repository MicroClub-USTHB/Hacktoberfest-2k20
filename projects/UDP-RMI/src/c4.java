import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class c4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String pr,s,sd;
				try {
					
					ServerSocket s4 =new ServerSocket(2006);
				 
					System.err.println("waiting c4...");
					
					Socket con = s4.accept();
					
					System.err.println("connected..");
					
					ObjectInputStream in=new ObjectInputStream(con.getInputStream());
					
					s= (String) in.readObject();	
					pr= (String) in.readObject();	

					Socket c4=new Socket("localhost",2007);
					
					ObjectOutputStream out=new ObjectOutputStream(c4.getOutputStream());
					
					out.writeObject(s);
					out.writeObject(pr);
				
					con = s4.accept();
					
					System.err.println("connected C4--2..");
					
					in=new ObjectInputStream(con.getInputStream());
					sd= (String) in.readObject();	
					s= (String) in.readObject();
					String fact= (String) in.readObject();
					//System.out.println("la class2 a recever ="+sd+" et "+s);
					
					Socket c=new Socket("localhost",2005);
				
					out=new ObjectOutputStream(c.getOutputStream());
					
					out.writeObject(sd);
					out.writeObject(s);
					out.writeObject(fact);
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				}

	}

}
