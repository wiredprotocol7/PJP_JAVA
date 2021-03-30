
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_eighteen
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {   
	 String num;
	 System.out.print("Please enter an integer number\n");
	 BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
	 num=br.readLine();
	 
	 String ans="";
	 
	 int  i=num.length()-1;
	 
	 while(i>=0)
	 {
		 ans+=String.valueOf(num.charAt(i));
		 i--;
	 }
	 
	 if (num.equals(ans))
	 {
		 System.out.println(num+" is a palindrome.");
	 }
	 else
	 {
		 System.out.println(num+" is not a palindrome.");
	 }
	
   }
}
