import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface{
	public HelloImpl() throws RemoteException{
	}
	public int Add_fn(int a,int b)
	{
//		System.out.println("REMOTE SERVICE: Remote Client REquest Message is : "+s1);
//		StringBuilder sb=new StringBuilder(s1);
		
		return (a+b);
	}
}