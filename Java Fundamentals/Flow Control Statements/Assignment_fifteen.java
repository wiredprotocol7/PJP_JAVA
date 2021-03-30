import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_fifteen
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {
	   
	 String num;
	 System.out.print("Please enter an integer number\n");
	 BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
	 num=br.readLine();
	 int ans=0;
	 for (int j=0;j<num.length();j++ )
	 {
		 ans+=Integer.parseInt(String.valueOf(num.charAt(j)));
     } 
	 System.out.println(ans);
   }
}
