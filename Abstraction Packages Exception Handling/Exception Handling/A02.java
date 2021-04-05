import java.io.*;

import java.util.Arrays;
public class A02
{
	public static void main(String args[]) throws IOException
	{
		   

			System.out.println("Enter the number of elemets in the array");
		    BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
			int len = Integer.parseInt(br.readLine());
			int[] array = new int[len];
			System.out.println("Enter the elements in the array");
			for(int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("Enter the index of the array you want to access");
			int keyIndex = Integer.parseInt(br.readLine());
			try {
				System.out.println("The array element at index "+ keyIndex +" = "+ array[keyIndex]);
				System.out.println("The array element successfully accessed");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getClass());
			}

	
	}
}
