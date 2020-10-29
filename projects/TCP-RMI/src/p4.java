import java.net.ServerSocket;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ServerNotActiveException;

public class p4  extends java.rmi.server.UnicastRemoteObject implements IP4{
private static int n,m;
public String  cube (double a ,int b ){
	double s=a+b;
	int somme=0;
String cubeval="";
	String str =Double.toString(s);
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
	cubeval="Vide";
	return cubeval;
}
@Override





public void data(double a, int b) throws Exception {
	// TODO Auto-generated method stub

	System.err.println(a+"*"+b+"="+a*b);
	System.out.println(cube(a,b));

}
@Override
public void seta(double a) throws Exception {
	// TODO Auto-generated method stub
n=(int)a	;

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
