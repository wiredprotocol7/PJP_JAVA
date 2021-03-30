import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_fourteen
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {
	   
	 int num;
	 System.out.print("Please enter an integer number\n");
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
	 
	 if (num==0|num==1)
	 {
		 System.out.print(num+" is neither prime or composite.");
	 }
	 
	 else if(fuse)
	 {
		 System.out.print(num+" is prime.");
	 }
	 else if (!fuse)
	 {
		 System.out.print(num+" is not prime.");
	 }
	   
   }
}
