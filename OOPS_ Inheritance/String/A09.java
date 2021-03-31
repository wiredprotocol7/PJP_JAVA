import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class A19 {

	public static void main(String[] args) throws IOException 
	{
		System.out.print("Input the  string.\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] array = str.split(",");
		String A=array[0];
		String B= array[1];
		
		int i=0,j=0;
		String ans="";
		while ((i<A.length())&(j<B.length()))
		{
			ans+=A.charAt(i++);
			ans+=B.charAt(j++);
					
		}
		
		StringBuffer sr=new StringBuffer();
		sr.append(ans);
	    sr.append(A.substring(i, A.length()));
		sr.append(B.substring(j, B.length()));
		System.out.print(sr.toString());
		
		
	}

}
