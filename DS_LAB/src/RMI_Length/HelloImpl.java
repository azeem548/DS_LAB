import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface{
	public HelloImpl() throws RemoteException{
	}
	public String DisplayLength(String s)
	{
                System.out.println("Client Requested to find the length of the string+"+s+"\n");
                
//		System.out.println("REMOTE SERVICE: Remote Client REquest Message is : "+s1);
//		StringBuilder sb=new StringBuilder(s1);
		int response=s.length();
		return ("The Length of the given string is:"+response);
	}
}