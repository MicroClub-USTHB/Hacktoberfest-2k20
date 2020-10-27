import java.rmi.Remote;

public interface IP4  extends Remote{
void data (int a,int b)throws Exception;
void seta (int a)throws Exception;
void setb (int b)throws Exception;
String  cube (int a ,int b )throws Exception;
}
