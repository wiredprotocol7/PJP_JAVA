package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class method {
	
    public static List<String> modify(String S1, String S2) {
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < S1.length(); i += 2) {
            sb.append(S2);
            sb.append(S1.charAt(i));}
        list.add(sb.toString());
        int occurrence = S1.split(S2, -1).length - 1;
        if (occurrence > 1)
            list.add(S1.substring(0, S1.lastIndexOf(S2)) + new StringBuilder(S2).reverse());
        if (occurrence > 1)
            list.add(S1.substring(0, S1.indexOf(S2)) + S1.substring(S1.indexOf(S2) + S2.length(), S1.length()));
        int p = S2.length() % 2 == 0 ? S2.length() / 2 : S2.length() / 2 + 1;
        list.add(S2.substring(0, p) + S1 + S2.substring(p, S2.length()));
        sb = new StringBuilder();
        for (int j = 0; j < S1.length(); j++) {
            if (S2.indexOf(S1.charAt(j)) != -1)
                sb.append('*');
            else
                sb.append(S1.charAt(j));
        }
        list.add(sb.toString());

        return list;}

    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
    	 String S1 = br.readLine();
         String S2 = br.readLine();

         List<String> list = modify(S1, S2);
         System.out.println(list);
     }


    }

