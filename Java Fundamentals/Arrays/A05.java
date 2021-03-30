import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A05
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
	   

	   int min[]= {Integer.MAX_VALUE,Integer.MAX_VALUE};
	   int max[]= {Integer.MIN_VALUE,Integer.MIN_VALUE};
	   for(int j=0;j<array.length;j++)
	   {
		   if(array[j]<min[1])
		   {   min[0]=min[1];
			   min[1]=array[j];
			   
		   }
		   if (array[j]>max[1])
		   {   max[0]=max[1];
			   max[1]=array[j];
		   }
	   }
	   
	   System.out.println("The Maximum 2 numbers are "+Arrays.toString(max).replace("[","").replace("]", "")+" .The minimum 2 numbers are "+Arrays.toString(min).replace("[","").replace("]", ""));
   }
}
