import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A04
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {   System.out.print("Input the numbers of array.\n");
	   BufferedReader br= new BufferedReader( new InputStreamReader ( System.in));
	   String inp=br.readLine();
	   String[] inparr= inp.split(" ");
	   char[] array=new char[inparr.length];
	   
	   for (int i=0; i<inparr.length;i++)
	   {
		   array[i]=(char)Integer.parseInt(inparr[i]);
	   }
	   
	   System.out.print(Arrays.toString(array).replace(",", "").replace("[", "").replace("]", ""));
   }
}
