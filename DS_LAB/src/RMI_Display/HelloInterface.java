import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote{
	String DisplayMsg() throws RemoteException;
}