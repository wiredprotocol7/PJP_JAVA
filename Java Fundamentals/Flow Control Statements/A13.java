import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A13
{
   public static void main (String args[]) throws NumberFormatException, IOException
   {
	   
	 int num=10;
	 /*BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
	 num=Integer.parseInt(br.readLine());*/
	 
	 while (num<100)
	 {	 boolean fuse=true;
		 
		 for (int i=2;i<=Math.sqrt(num) ;i++)
		 {
			 if (num%i==0)
			 {
				 fuse=false;
			 }
		 }
		 
		 if((fuse)&!(num==1))
		 {
			 System.out.println(num);
		 }
		 num++;
	 }
	   
   }
}
