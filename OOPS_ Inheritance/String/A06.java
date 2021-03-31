import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class A06 {

	public static void main(String[] args) throws IOException 
	{
		System.out.print("Input the  strings\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] array = str.split(",");
		String in,out;
		if(array[0].length()<array[1].length())
		{
			in=array[1];
			out=array[0];
		}
		else
		{
			in=array[0];
			out=array[1];
		}
		
		System.out.print(out+in+out);
       
		
	}

}
