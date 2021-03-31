import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class A05 {

	public static void main(String[] args) throws IOException 
	{
		System.out.print("Input the  string\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		/*String[] array = str.split(",");*/
        if (str.length()>=2)
	    {System.out.print(str.substring(1,str.length()-1));}
        else
        {
        	System.out.print("Input a larger string.");
        }
		
	}

}
