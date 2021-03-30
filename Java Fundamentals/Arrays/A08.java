import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class modifiedSum

 {
	 public int modifiedsum(int arr[])	 
	 {
		 int a=0,b=0,sum=0;
		 for (int i=0; i<arr.length; i++)
		 {
			 if (arr[i]==6)
			 {
				 a=i;
			 }
			 
			 if(arr[i]==7)
			 {
				 b=i;
			 }
			 sum+=arr[i];
		 }
		 
		 int diff=0;
		 if(a<b)
		 {   for (int j =a; j<=b; j++)
			 {
				 diff+=arr[j];
			 }
		 }
		 
		return sum-diff;
		 
	 }
}

public class A08
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {   System.out.print("Input the numbers.\n");
	   BufferedReader br= new BufferedReader( new InputStreamReader ( System.in));
	   String inp=br.readLine();
	   String[] inparr= inp.split(",");
	   int[] array=new int[inparr.length];
	   
	   for (int i=0; i<inparr.length;i++)
	   {
		   array[i]=Integer.parseInt(inparr[i]);
	   }
	   modifiedSum obj= new modifiedSum();
	   System.out.println(obj.modifiedsum(array)); 
   }
}
