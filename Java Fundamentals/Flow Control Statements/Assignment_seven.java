import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_seven {
	
	public static void main (String args[]) throws IOException
	{
	   char inp;
	   
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
	   
	   inp= (char) br.read();
	   
	   if(!Character.isUpperCase(inp))
	   {
		   System.out.println(inp+"->"+Character.toUpperCase(inp));
	   }
	   else
	   {
		   System.out.println(inp+"->"+Character.toLowerCase(inp));
	   }
	
	}

}
