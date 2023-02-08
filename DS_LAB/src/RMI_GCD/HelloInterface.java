import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote{
	int GCD(int a,int b) throws RemoteException;
}