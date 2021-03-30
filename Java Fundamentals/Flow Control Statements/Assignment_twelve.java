import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_twelve
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {
	   
	 int num;
	 BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
	 num=Integer.parseInt(br.readLine());
	 boolean fuse=true;
	 
	 for (int i=2;i<=Math.sqrt(num) ;i++)
	 {
		 if (num%i==0)
		 {
			 fuse=false;
		 }
	 }
	 
	 if((fuse)&!(num==1))
	 {
		 System.out.print("The given number is prime.");
	 }
	 else
	 {
		 System.out.print("The given number is not prime.");
	 }
	   
   }
}
