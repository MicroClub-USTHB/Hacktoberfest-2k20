import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class c3 {
public static int pro(int s){

	int pr=1;
	for (int i = 2; i <= s; i++) {
	
	boolean b=true;int prm=2;
	while (b && prm<i) {
		if(i%prm==0){
			b=false;
		}else{
			prm++;
		}
	}
	if(b==true)
		pr*=i;
	
	}
	
	return pr;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String n,sd,m,sr;
		int s,pr;
		int trm=0;
				try {
					
					ServerSocket s3 =new ServerSocket(2005);
					System.err.println("waiting c3...");
					Socket con = s3.accept();
					System.err.println("connected..");
					ObjectInputStream in=new ObjectInputStream(con.getInputStream());
					n= (String) in.readObject();
					m=(String) in.readObject();
				
					s=Integer.parseInt(n)+Integer.parseInt(m);
				   
					pr=pro(s);
					System.err.println("pr=0"+pr+"\n s="+s);
				
				    Socket c3=new Socket("localhost",2006);
				
				    ObjectOutputStream out=new ObjectOutputStream(c3.getOutputStream());
				
				    out.writeObject(Integer.toString(s));
				    out.writeObject(Integer.toString(pr));
								
				    con = s3.accept();
					System.err.println("connected c3--2..");
					 
					in=new ObjectInputStream(con.getInputStream());
					
					sd= (String) in.readObject();	
					s= Integer.parseInt( (String) in.readObject());
					String fact= (String) in.readObject();	
					
					Socket c=new Socket("localhost",2004);
					
					out=new ObjectOutputStream(c.getOutputStream());
					
					out.writeObject(sd);
					out.writeObject(Integer.toString(s));
					out.writeObject(fact);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				}
	}

}
