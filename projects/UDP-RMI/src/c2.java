import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class c2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String n,m;
			
		int trm=0;
				try {
					
					ServerSocket s =new ServerSocket(2004);
					
					System.err.println("waiting c2 ...");
					
					Socket con = s.accept();
					System.out.println("donner M:");
					Scanner sc=new Scanner(System.in);
					 m=sc.next();	
					
					ObjectOutputStream outC=new ObjectOutputStream(con.getOutputStream());
					
					System.err.println("connected..");
					
					ObjectInputStream in=new ObjectInputStream(con.getInputStream());
					n= (String) in.readObject();	

					Socket c2=new Socket("localhost",2005);
					
					ObjectOutputStream out=new ObjectOutputStream(c2.getOutputStream());
					
					out.writeObject(n);
					out.writeObject(m);
				
				
				//send to c1 
				con = s.accept();
				System.err.println("connected..");
				 in=new ObjectInputStream(con.getInputStream());
				String sd= (String) in.readObject();	
				String ss= (String) in.readObject();
				String fact= (String) in.readObject();
				
				outC.writeObject(sd);
				outC.writeObject(ss);
				outC.writeObject(fact);
			
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				}

	}

}
