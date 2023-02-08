import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.registry.LocateRegistry;

public class HelloServer{
	public HelloServer() throws RemoteException{
	}
	public static void main(String args[]) throws RemoteException
	{
		HelloImpl hiObj=new HelloImpl();
		int port=Integer.parseInt(args[1]);
		try{
			LocateRegistry.createRegistry(port);
			System.out.println("\n RMI registry created \n");
			String host=args[0];
			String bindLocation="//"+host+":"+port+"/"+args[2];
			Naming.bind(bindLocation,hiObj);
			System.out.println("\nRMI server ready at "+bindLocation);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	
	
