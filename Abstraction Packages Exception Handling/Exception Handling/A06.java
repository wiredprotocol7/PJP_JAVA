import java.io.*;

@SuppressWarnings("serial")
class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		System.out.println("NegativeValuesException occured");
	}
}

@SuppressWarnings("serial")
class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException() {
		System.out.println("ValuesOutOfRangeException occured");
	}
}
public class A06
{
	public static void main(String args[]) throws IOException, NegativeValuesException, ValuesOutOfRangeException
	{
		  	
		    BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
			//int len = Integer.parseInt(br.readLine());

            int sum=0;
			for (int i = 0; i < 2; i++) 
			{
				String name = br.readLine();
				int inp[]= new int[3];	
				for(int m=0;m<3;m++)
						{try
						    {
							inp[m]=Integer.parseInt(br.readLine());
						    if (inp[m]<0) {throw new NegativeValuesException();}
						    else if (inp[m]>100) {throw new ValuesOutOfRangeException();}
						    }
							 catch( NumberFormatException e)
							{
								 System.out.println("NumberFormatException");
							}		
		                 } 

				System.out.println("Name: " + name);
				for(int m=0;m<3;m++)
				{System.out.println("Marks of subject "+m+" : " + inp[m]);
				sum+=inp[m];}	
			
		}
		System.out.println("The average is:"+((float)sum)/6);
	}
			
}
