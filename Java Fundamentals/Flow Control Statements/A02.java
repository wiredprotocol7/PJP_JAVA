import java.io.*;
public class A02
{
	public static void main(String args[])
	{
		
		long num;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please input a Number\n");
		
		try {
			num=Long.parseLong(br.readLine());	
			if (num%2==0)
			{
				System.out.println("The input number is even.");
			}
			else
			{
				System.out.println("The input number is odd.");
			}

		} catch (NumberFormatException e) {
			System.err.println("Please input a Number");
	
		} catch (IOException e) {
			System.err.println("Please input a Number");
			
		}
	
	}
}
