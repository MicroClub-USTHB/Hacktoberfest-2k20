import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ServerNotActiveException;

public class p4  extends java.rmi.server.UnicastRemoteObject implements IP4{
private static int n,m;

public String  cube (int a ,int b ){
	int s=a+b;
	int somme=0;
String cubeval="";
	String str =Integer.toString(s);
	System.err.println(str.length());
	
	String ss;
	System.out.println(s);
	for(int i=100;i<s;i++){
		if(str.length()==3){
			int somme2 = 0,j;
			int x=i;
			somme2+=Math.pow(x%10, 3);
			x=i/10;
			somme2+=Math.pow(x%10, 3);
			x=i/100;
			somme2+=Math.pow(x, 3);
		 if(somme2==i){
			 //	System.err.println("cube"+somme2);
			 cubeval+=Integer.toString(i)+" / ";
		 }
		}
	}

	if(cubeval=="")
	cubeval="vide";
	
	return cubeval;
}
@Override
public void data(int a, int b) throws Exception {
	// TODO Auto-generated method stub

	System.err.println(a*b);
System.out.println(	cube(a,b));
//UDP send C2

DatagramSocket client =new DatagramSocket();
InetAddress ipadd=InetAddress.getByName("localhost");
byte [] senddata =new byte[10];
byte [] recivedata =new byte[10];
String phr =Integer.toString(a);
senddata=phr.getBytes();
DatagramPacket sendP =new DatagramPacket(senddata, senddata.length,ipadd,9877);
client.send(sendP);

//UDP send C1
phr =Integer.toString(b);
recivedata=phr.getBytes();
sendP =new DatagramPacket(recivedata, recivedata.length,ipadd,9876);
client.send(sendP);


}
@Override
public void seta(int a) throws Exception {
	// TODO Auto-generated method stub
n=a	;

}
@Override
public void setb(int b) throws Exception {
	// TODO Auto-generated method stub
	m=b;
}
protected p4() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public static void main(String[] args) throws RemoteException, ServerNotActiveException {
		// TODO Auto-generated method stub
		p4 s=new p4();
		Registry reg =LocateRegistry.createRegistry(1006);
		reg.rebind("SD",s);

	}

	}
