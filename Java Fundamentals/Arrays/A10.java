public class A19
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {   System.out.print("Please Enter 9 integer number. \n");
	   BufferedReader br= new BufferedReader( new InputStreamReader ( System.in));
	   String inp=br.readLine();
	   String[] inparr= inp.split(" ");
	   int[][]array=new int[3][3];
	   int c=0;
	   for (int i=0; i<3;i++)
	   {for (int j=0;j<3;j++)
		   {array[i][j]=Integer.parseInt(inparr[c++]);}
	   }
	   
	   int max=Integer.MIN_VALUE;
		System.out.println("The given array is :");				
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++) 
			{
					System.out.print(array[i][j] + "\t");
					if (array[i][j]>max)
					{
						max=array[i][j];
					}
					
			}
			System.out.println();
		}
		System.out.print(max);

   }
}
