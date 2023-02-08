import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface{
	public HelloImpl() throws RemoteException{
	}
	public int GCD(int a,int b)
        {
            if(b==0)   
                   return(a);
            else
                   return(GCD(b,(a%b)));
	}
}