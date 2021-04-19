package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


class Box implements Comparable<Box> {
    protected double l;
    protected double b;
    protected double h;
    public Box(double l, double b, double h) {
        super();
        this.l=l;
        this.b=b;
        this.h=h;
    }

    


	@Override
	public int compareTo(Box o) {
		
		if(l*b*h==o.b*o.l*o.h)
		{
			return 0;
		}
		else if(l*b*h<o.b*o.l*o.h)
		{
			return -1;
		}
		
		return 1;
			
	}


}

public class menu {

    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
        SortedSet<Box> set = new TreeSet<Box>();
   
        System.out.print("Enter the no of Box\n");
        int count=Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            System.out.println("Enter the box details:");
    
            int l=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            int h=Integer.parseInt(br.readLine());
            
            Box box= new Box(l,b,h);
            
            set.add(box);
            

        }
    
        System.out.println("Unique boxes in Set are:");


        	for (Box box:set)
               System.out.println(box.l + "\t " + box.b + "\t "+box.h + "\t ");

        br.close();
    }

}