import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

 class Removeduplicate
 
 {
	public Boolean doescontain(int arr[],int num)
	{
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]==num)
			{
				return true;
			}
		}
		
		return false;
	}
    public int[] removeduplicate(int arr[])
    {   int[] temp=new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
    	Arrays.sort(temp);
    	int count=0;	
    	int back=Integer.MIN_VALUE;
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		if (temp[i]!=back)
    		{
    			back=temp[i];
    			count++;
    		}
    	}
    	
    	int [] ans= new int[count];
    	Arrays.fill(ans, Integer.MIN_VALUE);
    	int j=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if (!doescontain(ans,arr[i]))
    		{
    			ans[j]=arr[i];
    			j++;
    		}
    	}
		return ans;
    }
}
public class A07
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
	   Removeduplicate obj= new Removeduplicate();
	   System.out.println(Arrays.toString(obj.removeduplicate(array)).replace("[", "").replace("]", "").replace(",", " "));
   }
}
