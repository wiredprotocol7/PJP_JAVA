import java.io.*;

import java.util.Arrays;
import java.util.InputMismatchException;
public class A05 
{
	public static void main(String args[]) throws IOException
	{
		  	
		    BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
			//int len = Integer.parseInt(br.readLine());
			System.out.print("Enter 1st integer\n");
			int num1 = Integer.parseInt(br.readLine());
			System.out.print("Enter 2nd integer\n");
			double result = 0;
			int num2 = Integer.parseInt(br.readLine());
			try {
				result = ((float)num1)/num2;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Result: " + result);
	}
}
