import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class A08 {

	public static void main(String[] args) throws IOException 
	{
		System.out.print("Input the  string.\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		/*String[] array = str.split(",");*/
		String ans="";
		
		for (int i=0; i<str.length();i++)
		{
			if( str.charAt(i)!='*')
			{
				ans+=(str.charAt(i));
			}
		}
		
		System.out.print(ans);
		
	}

}
