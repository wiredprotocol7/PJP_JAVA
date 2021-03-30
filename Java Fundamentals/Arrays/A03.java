import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A03
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {   System.out.print("Input the numbers of array.\n");
	   BufferedReader br= new BufferedReader( new InputStreamReader ( System.in));
	   String inp=br.readLine();
	   String[] inparr= inp.split(" ");
	   int[] array=new int[inparr.length];
	   
	   for (int i=0; i<inparr.length;i++)
	   {
		   array[i]=Integer.parseInt(inparr[i]);
	   }
	   System.out.print("Input the numbers to find.\n");
	   int find=Integer.parseInt(br.readLine());
	   
	   int index=-1;
	   
	   for (int j =0; j<array.length;j++)
	   {
		   if(array[j]==find)
		   {
			   index=j;
			   break;
			   
		   }
	   }
	   
	   System.out.print(index);
   }
}
