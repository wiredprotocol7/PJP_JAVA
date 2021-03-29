import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_four {
	
	public static void main (String args[]) throws IOException
	{
	   char one, two;
	   
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
	   
	   one=(char) br.read();
	   two=(char) br.read();
	   
	   if (one>two)
	   {
		   System.out.println(two+","+one);
	   }
	   else
	   {
		   System.out.println(one+","+two);
	   }
	   
	}

}
