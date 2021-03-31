import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class A10 {

	public static void main(String[] args) throws IOException 
	{
		System.out.print("Input the  string.\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] array = str.split(",");
		String A=array[0];
		int n= Integer.parseInt(array[1]);
		int i=0;
		StringBuffer sr=new StringBuffer();
		while(i<n)
		{
			sr.append(A.substring(A.length()-n, A.length()));
			i++;
		}
		System.out.print(sr.toString());

		
		
	}

}
