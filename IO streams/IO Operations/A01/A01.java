package pjp_java;
import java.io.*;
public class A01 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the file name");
		String filename=br.readLine();
		FileInputStream fin = new FileInputStream("C:\\Users\\Shubhashish PC\\eclipse-workspace\\pjp_java\\src\\pjp_java\\"+filename);
		System.out.print("Enter the character to be counted");
		char find=Character.toLowerCase(br.readLine().charAt(0));
		   int i;
		   int count=0;
		    while ((i=fin.read()) != -1)
		    { if(Character.toLowerCase((char)i)==find)
		    {
		    	count++;
		    }
		  }
		    
		 System.out.println("File "+filename+" has "+ count +" instances of letter "+find+" .");   
	}

}
