import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class MergeSort
{
	void merge(int arr[], int left, int mid, int right)
	{
		int rangeone = mid - left + 1;
		int rangetwo = right - mid;
		int L[] = new int[rangeone];
		int R[] = new int[rangetwo];
		for (int i = 0; i < rangeone; ++i)
			L[i] = arr[left + i];
		for (int j = 0; j < rangetwo; ++j)
			R[j] = arr[mid + 1 + j];
		int i = 0, j = 0;
		int k = left;
		while (i < rangeone && j < rangetwo) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < rangeone) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < rangetwo) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}


	void sort(int arr[], int left, int right)
	{
		if (left < right) {
	
			int m =left+ (right-left)/2;	
			sort(arr, left, m);
			sort(arr, m + 1, right);
			merge(arr, left, m, right);
		}
	}
}

public class A06
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
	   
	   MergeSort obj=new MergeSort();
	   obj.sort(array, 0, array.length-1);
	   
	   System.out.println(Arrays.toString(array).replace("[", "").replace("]", ""));
	 
   }
}
