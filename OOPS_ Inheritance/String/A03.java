import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class A03 {

	public static void main(String[] args) throws IOException 
	{
		System.out.print("Input the  string\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		/*String[] array = str.split(",");*/
		String ans="";
		int init=0;
		while (init<str.length())
		{
			init++;

			ans=ans.concat(str.substring(0, 2));
		}
		System.out.print(ans);

	
	}

}
