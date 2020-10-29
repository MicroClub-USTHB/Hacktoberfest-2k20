import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// 
	try {
		Scanner sc=new Scanner(System.in);
		Socket c=new Socket("localhost", 1004);
		System.out.println("donner n :");
		String n=sc.next();
	
	ObjectOutputStream out =new ObjectOutputStream(c.getOutputStream());
	out.writeObject(n);
	
	ObjectInputStream in =new ObjectInputStream(c.getInputStream());
	String val= (String) in.readObject();
	String val2= (String) in.readObject();
		System.out.println(val+"  "+val2);
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
