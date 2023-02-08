import java.rmi.*;
import java.io.*;
import java.net.MalformedURLException;

public class HelloClient {
	public static void main(String args[])
	{
		String connectLocation="//"+args[0]+":"+Integer.parseInt(args[1])+"/"+args[2];
		HelloInterface hintf=null;
		try{
			System.out.println("\n Connecting the client at: "+connectLocation);
			hintf=(HelloInterface)Naming.lookup(connectLocation);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nCLI: Enter the request message to send to remote service:");
			String s=br.readLine();
			String response=hintf.helloMsg(s);
			System.out.println("\n CLI: response from remote method is:"+response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	
