package Maain;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lib.Employee;
public class menu {
	
	public static void main(String[] args) 
			throws IOException, FileNotFoundException, ClassNotFoundException {
		
		BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
		int choice = 0;
		
		String filename = "Employee";
		
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		FileInputStream fis = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		do {
			System.out.println("Main Menu");
			System.out.println("1. Add Employee\n");
			System.out.println("2. Display All\n");
			System.out.println("3. EXIT\n");
			choice = Integer.parseInt(br.readLine());
			
			switch (choice) {
			case 1:
				
				System.out.print("\nEnter Employee ID: ");
				int id=Integer.parseInt(br.readLine());

				System.out.print("\nEnter Name: ");
				String name=br.readLine();
				System.out.print("\nEnter Age: ");
				int age=Integer.parseInt(br.readLine());
				System.out.print("\nEnter Salary: ");
				double sa=Double.parseDouble(br.readLine());
				Employee emp = new Employee(id,name,age,sa);
				oos.writeObject(emp);
				break;
			case 2:
				System.out.println("----Report-----");
				emp = null;
				while (fis.available() > 0) {
					emp = (Employee) ois.readObject();
					System.out.println(emp);
				}
				System.out.println("----End of Report-----");
				break;
			case 3:
				System.out.println("Exiting the System");
			}
		} while (choice != 3);
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		br.close();	
	}

}
