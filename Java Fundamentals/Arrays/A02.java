import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A02
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
	   

	   int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
	   for(int j=0;j<array.length;j++)
	   {
		   if(array[j]<min)
		   {
			   min=array[j];
		   }
		   if (array[j]>max)
		   {
			   max=array[j];
		   }
	   }
	   
	   System.out.println("The Maximum no  is "+max+" and Minimum no is "+min);

   }
}
