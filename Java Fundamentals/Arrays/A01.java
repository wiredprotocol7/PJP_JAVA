import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A01
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {   System.out.print("Input the numbers.\n");
	   BufferedReader br= new BufferedReader( new InputStreamReader ( System.in));
	   String inp=br.readLine();
	   String[] inparr= inp.split(" ");
	   int[] array=new int[inparr.length];
	   
	   for (int i=0; i<inparr.length;i++)
	   {
		   array[i]=Integer.parseInt(inparr[i]);
	   }
	   
	   int sum = 0;
	   
	   for(int j=0;j<array.length;j++)
	   {
		   sum+=array[j];
	   }
	   
	   System.out.println("The sum is "+sum+" and average is "+((float)sum/array.length));

   }
}
