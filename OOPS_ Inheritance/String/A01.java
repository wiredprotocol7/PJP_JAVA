import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class A01 {

	public static void main(String[] args) throws IOException 
	{
		System.out.print("Input a string\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringBuffer rev=new StringBuffer(str);
		rev.reverse();
		if(str.equals(rev.toString()))
		{
			System.out.print(str+" is Palindrome.");
		}
		else
		{
			System.out.print(str+" is not a Palindrome.");
		}
		

	}

}
