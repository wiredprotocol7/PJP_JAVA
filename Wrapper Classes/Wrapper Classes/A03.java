import java.io.BufferedReader;

public class A03 {

	public static void main(String[] args) {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
	   //  Integer.parseInt(br.readLine());

		System.out.print("Enter the integer number (1 to 255) :");
		int intNum =  Integer.parseInt(br.readLine());
		
		String output = String.format("%8s", Integer.toBinaryString(intNum)).replace(' ', '0');
		System.out.println(output);	
	}

}
