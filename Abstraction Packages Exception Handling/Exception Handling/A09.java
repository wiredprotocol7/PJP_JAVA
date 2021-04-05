import java.io.*;
public class A09
{

	public static void main(String args[]) throws IOException
	{
	    BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
		//int len = Integer.parseInt(br.readLine());
		  	
	
		try {
			System.out.println("Enter the 2 numbers");
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int quotient = a / b;
			System.out.println("The quotient of " + a + " / " + b + " = " + quotient);
		} 
		catch (ArithmeticException e) {
			System.out.println("DivideByZeroException caught");
		} 
		finally {
			System.out.println("Inside finally block");
		}

	}
	
