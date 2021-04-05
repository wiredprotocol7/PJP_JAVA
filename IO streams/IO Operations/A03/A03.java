package pjp_java;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
public class A03 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the file name to copy from");
		String fileinname=br.readLine();
		System.out.print("Enter the file name to write to");
		String fileoutname=br.readLine();
		//FileInputStream fin = new FileInputStream("C:\\Users\\Shubhashish PC\\eclipse-workspace\\pjp_java\\src\\pjp_java\\"+fileinname);
		Path path=Paths.get("C:\\Users\\Shubhashish PC\\eclipse-workspace\\pjp_java\\src\\pjp_java\\"+fileinname);
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Shubhashish PC\\eclipse-workspace\\pjp_java\\src\\pjp_java\\"+fileoutname);
		String content = Files.readString(path, StandardCharsets.US_ASCII);
		String[] inp=content.split(" ");
		SortedMap<String, Integer> dic= new TreeMap<String, Integer>();
        for (int i = 0; i < inp.length; i++) 
        {
        	dic.put(inp[i], 0);
        }
        for (int i = 0; i < inp.length; i++) {
        	//System.out.print(inp[i]+" "+i);
            String key = inp[i];
            int freq = dic.get(key);
            freq+=1;
            dic.put(key,freq);
        }
        for (Entry<String, Integer> result : dic.entrySet()) {
            fout.write((result.getKey() + " " + result.getValue()+"\n").getBytes());
        }
		 
		    
	  
	}

}
