import java.rmi.*;
import java.io.*;
import java.net.MalformedURLException;
import java.util.*;
import java.io.*;
public class HelloClient {
	public static void main(String args[])
	{
		String connectLocation="//"+args[0]+":"+Integer.parseInt(args[1])+"/"+args[2];
		HelloInterface hintf=null;
		try{
			System.out.println("\n Connecting the client at: "+connectLocation);
			hintf=(HelloInterface)Naming.lookup(connectLocation);
//			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("\nCLI: Enter the request message to send to remote service:");
//			String s=br.readLine();
                        System.out.println("Enter two numbers whose GCD needs to be found:");
                        Scanner sc = new Scanner(System.in);
                        int a = sc.nextInt();
                        int b =sc.nextInt();
			int response=hintf.GCD(a,b);
			System.out.println("\n CLI: response from remote method is:\nThe GCD is:"+response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	
