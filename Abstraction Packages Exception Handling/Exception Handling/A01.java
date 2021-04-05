import java.io.*;

import java.util.Arrays;
public class A01
{
	public static void main(String args[]) throws IOException
	{
		    String inp;
		    BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
		    inp=br.readLine();
			try {
				int Num = Integer.parseInt(inp);
				System.out.println("The square is "+ Num * Num);
				System.out.println("The work has been done successfully");
			}
			catch(NumberFormatException e) 
			{
				System.out.println("Entered input is not a valid format for an integer.");
			}
	
	}
}
