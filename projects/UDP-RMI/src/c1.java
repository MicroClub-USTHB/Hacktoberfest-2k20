import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class c1 {
	public static void main(String[] args) {
		System.out.println("donner N:");
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		
		// TODO Auto-generated method stub
		try{
			Socket c=new Socket("localhost",2004);
			System.out.println("holla.");
		
			ObjectOutputStream out=new ObjectOutputStream(c.getOutputStream());
			out.writeObject(n);
			
			ObjectInputStream in=new ObjectInputStream(c.getInputStream());
			
			String sd=(String) in.readObject();
			String s=(String) in.readObject();
			String fact=(String) in.readObject();
System.err.println("fact("+s+")="+fact+"\n SD="+sd);
				
		}catch(Exception e){
			System.out.println(e.toString());
		}


	}

}
