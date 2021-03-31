
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class A07 {

	public static void main(String[] args) throws IOException 
	{
		System.out.print("Input the  strings\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		/*String[] array = str.split(",");*/
		StringBuffer sr=new StringBuffer();
		sr.append(str);
		if (sr.charAt(0)=='x')
		{
			sr.deleteCharAt(0);
			
		}
		if(sr.charAt(sr.length()-1)=='x')
		{
			sr.deleteCharAt(sr.length()-1);
		}
		
		System.out.print(sr.toString());
		
	}

}
