package pjp_java;
import java.io.*;
public class A02 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the file name to copy from");
		String fileinname=br.readLine();
		System.out.print("Enter the file name to write to");
		String fileoutname=br.readLine();
		FileInputStream fin = new FileInputStream("C:\\Users\\Shubhashish PC\\eclipse-workspace\\pjp_java\\src\\pjp_java\\"+fileinname);
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Shubhashish PC\\eclipse-workspace\\pjp_java\\src\\pjp_java\\"+fileoutname);

		   int i;
		    while ((i=fin.read()) != -1)

		    {
		      fout.write(i);
		    }
		  
		    
		 System.out.println("File is copied.");   
	}

}
