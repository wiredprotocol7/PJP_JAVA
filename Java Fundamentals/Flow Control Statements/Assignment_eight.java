import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_eight {
	
	public static void main (String args[]) throws IOException
	{
	   String inp;
	   
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
	   
	   inp=  br.readLine();
	   
	   switch(inp)
	   {
	   
	   case "R": 
		   System.out.print("Red");
		   break;
	   case "B":
		   System.out.print("Blue");
		   break;
	   case "G":
		   System.out.print("Green");
		   break;
	   case "O":
		   System.out.print("Orange");
		   break;
	   case "Y":
		   System.out.print("Yellow");
		   break;
	   case "W":
		   System.out.print("White");
		   break;
	   default:
		   System.out.print("Invalid code");
		   
	   }
	
	}

}
