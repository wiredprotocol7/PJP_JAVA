import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_two {
	
	public static void main (String args[]) throws IOException
	{
	   char inp;
	   
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
	   
	   inp=(char) br.read();
	   
	   if (Character.isDigit(inp))
	   {
		   System.out.print("Digit");
	   }
	   else if (Character.isLetter(inp))
	   {
		   System.out.print("Alphabet");
	   }
	   else
	   {
		 System.out.print("Special Character");   
	   }
	   
	}

}
