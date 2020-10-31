import java.rmi.Remote;

public interface IP4  extends Remote{
void data (double d,int b)throws Exception;
void seta (double d)throws Exception;
void setb (int b)throws Exception;
String  cube (double a ,int b )throws Exception;
}
