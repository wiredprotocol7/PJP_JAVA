import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class A02 {

	public static void main(String[] args) throws IOException 
	{
		System.out.print("Input the  strings\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] array = str.split(",");
		String ans;
		if (array[0].charAt(array[0].length()-1)==array[1].charAt(0))
			{
			ans=array[0].concat(array[1].substring(1,array[1].length()));		
			}
		else
		{
			ans=array[0].concat(array[1]);	
		}

		System.out.print(ans.toLowerCase());
	
	}

}
