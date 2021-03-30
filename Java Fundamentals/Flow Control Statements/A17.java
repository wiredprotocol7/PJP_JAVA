import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A17
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
	 
	 System.out.print(ans);
	
   }
}
