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
		
		String ans;
		if(str.charAt(0)=='*') 
		{
			 ans="";
		}
		else
		{
		    ans=Character.toString(str.charAt(0));
		}
		for (int i=1; i<str.length()-1;i++)
		{
			if(( str.charAt(i)!='*')&( str.charAt(i-1)!='*')&( str.charAt(i+1)!='*'))
			{
				ans+=(str.charAt(i));
			}
		
		}
		
		if(str.charAt(str.length()-1)=='*') 
		{
			 ans+="";
		}
		else 
		{
		    ans+=Character.toString(str.charAt(0));
		}
		
		System.out.print(ans);
		
	}

}
