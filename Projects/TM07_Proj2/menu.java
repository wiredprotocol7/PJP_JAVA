package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class stringset{
	List<String> map ;
	
	
	public stringset()
	{
	 map = new ArrayList<String>();
	}
	
	void insert(String word)
	{
		
		map.add(word);
		System.out.print("Inserted Successfully,\n");
	}
	boolean search(String word)
	{
		if(map.contains(word)==true)
		{System.out.print("Item is found\n"); return true;}
		else {System.out.print("Item is not found\n");return false;}
	}
	
	void delete(String word)
	{
		map.remove(word);
		System.out.print("Deleted successfully\n");
	}
	
	void display()
	{
		System.out.print("Item int the list are:\n");
		for(String i: map)
		{
			System.out.print(i+"\n");
		}
	}
	
	
}

public class menu {

    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
        stringset dic = new stringset();

        int choice = 0;
        String item;
        int index;

        do {
            System.out.println("MAIN MENU");
            System.out.println("---------");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            choice = Integer.parseInt(br.readLine());
    

            switch (choice) {
            case 1:
                System.out.print("Enter the item to be inserted: ");
                item=br.readLine();
                if(!dic.search(item))
                {
                	dic.insert(item);
                }

                break;

            case 2:
            
                System.out.print("Enter the item to search: ");
                item=br.readLine();
                dic.search(item);
                break;

            case 3:
                System.out.print("Enter the item to delete: ");
                item=br.readLine();
                if(dic.search(item))
                {
                	dic.delete(item);
                }

                break;

            case 4:
   
                dic.display();
                break;

            case 5:
                System.out.println("Exiting. . . Thanks for using the application!!");
            }

        } while (choice != 5);

        br.close();
    }

}