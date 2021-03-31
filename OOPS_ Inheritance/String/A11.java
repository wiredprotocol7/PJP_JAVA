import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class A11 {

	public static void main(String[] args) throws IOException 
	{
		System.out.print("Input the  string.\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] array = str.split(",");
		String A=array[0];
		String B=array[1];
		
		String ans=new String();

		int i=0;
		while(i<A.length())
		{ /*System.out.print(ans+" "+i);
		System.out.println();*/
			int t=A.indexOf(B, i);

			if(t==-1)
			{
				break;
			}
		    if(t>=1)
				{ans+=A.charAt(t-1);}
			if(t+B.length()<A.length())
				{ans+=A.charAt(t+B.length());}

			
			i=t+B.length();
		}

        System.out.print(ans);	
	}

}
