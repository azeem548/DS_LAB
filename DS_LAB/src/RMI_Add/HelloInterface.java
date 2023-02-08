import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote{
	int Add_fn(int a,int b) throws RemoteException;
}