import java.io.*;

import java.util.Arrays;

public class A03
{
	public static void main(String args[]) throws IOException
	{
		   

			System.out.println("Enter the number of elemets in the array");
		    BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
			int len = Integer.parseInt(br.readLine());
			int[] array = new int[len];
			System.out.println("Enter the elements in the array");
			try {
				for(int i = 0; i < array.length; i++)
					array[i] = Integer.parseInt(br.readLine());
				System.out.println("Enter the index of the array you want to access");
				int index = Integer.parseInt(br.readLine());
				System.out.println("The array element at index "+ index +" = "+ array[index]);
				System.out.println("The array element successfully accessed");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			}
			catch(NumberFormatException e) {
				System.out.println("java.lang.NumberFormatException");
			}

	
	}
}
