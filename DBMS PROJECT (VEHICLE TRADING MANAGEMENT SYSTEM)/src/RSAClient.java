import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class RSAClient {
    private static Scanner sc;
	private static Socket s;
	private static Scanner sci;

	public static void main(String args[])
 throws UnknownHostException, IOException
	{
		BigInteger d = null;
		int p,q,n,phi,e,i,x;
		
		sc = new Scanner(System.in);
		s = new Socket("127.0.0.1",1342);
	 	sci = new Scanner(s.getInputStream());
		PrintStream ps = new PrintStream(s.getOutputStream());
		
		System.out.println("enter the first prime no:");
		p = sc.nextInt();
		System.out.println("enter the second prime no:");
		q = sc.nextInt();
		
		n=p*q;
		phi=(p-1)*(q-1);

		System.out.println("the value of phi ="+phi);

		for(e=2;e<=phi;e++)
		{
			if(GCD(e,phi)==1)   //e is public key
			{
				break;
			}
				
		}
		System.out.println("the value of e ="+e); //public key exponent are generated
		 
		for(i=0;i<=9;i++)
		{
			x=1+(i*phi);
			if(x%e==0)
			{
				d=BigInteger.valueOf(x/e);
				break;
			}
			
			
		}
		System.out.println("the value of d ="+d); // private key  exponent generated

		ps.println(e); //pass the data to server
		ps.println(n); // pass the data to server		
		
		System.out.println("Decrypted message is:-");
		int length =sci.nextInt();
                                 
  		while(length>0)
		{
			BigInteger c =sci.nextBigInteger();
			
			BigInteger msgback= c.modPow(d,BigInteger.valueOf(n));
			// this line decrypt the encrypted message

			int ci = msgback.intValue();
			System.out.println((char)ci);	
			
			length--;

		}	

		
		
		
				
	}
	
	static int GCD(int m, int n)
	{
		if(m<n)
			return (GCD(n, m));
		if(m%n == 0)
			return (n);
	
		return(GCD(n, m%n));
	 }	

    
}
