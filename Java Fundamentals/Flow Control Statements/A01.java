import java.io.*;
public class A01
{
	public static void main(String args[])
	{
		
		long num;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			num=Long.parseLong(br.readLine());			
			if(num >0)
			{
				System.out.println("The input number is positive.");
			}
			else if (num==0)
			{
				System.out.println("The input number is Zero.");
			}
			else
			{
				System.out.println("The input number is negative.");
			}
		} catch (NumberFormatException e) {
			System.err.println("Please Input a Number");
	
		} catch (IOException e) {
			System.err.println("Please Input a Number");
			
		}
	
	}
}
