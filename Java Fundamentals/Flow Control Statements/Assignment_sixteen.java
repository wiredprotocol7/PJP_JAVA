import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_sixteen
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {   
	 int num;
	 System.out.print("Please enter an integer number\n");
	 BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
	 num=Integer.parseInt(br.readLine());
	 
	 int i=1;
	 while(i<=num)
	 {
		 System.out.println("* ".repeat(i));
		 i++;
	 }
   }
}
