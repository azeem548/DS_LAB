import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote{
	String helloMsg(String s) throws RemoteException;
}