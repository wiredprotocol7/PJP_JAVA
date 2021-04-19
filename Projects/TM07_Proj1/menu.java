package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee> {
    protected String firstName;
    protected String lastName;
    protected long mobileNumber;
    protected String emailId;
    protected String address;

    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, long mobileNumber, String emailId, String address) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.address = address;
    }

    

    @Override
    public int compareTo(Employee emp) {
        return this.firstName.compareTo(emp.firstName) ;
    }

}

public class menu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));

        System.out.print("Please enter number of employees: ");
        int empCount = Integer.parseInt(br.readLine());
        List<Employee> empList = new ArrayList<Employee>();

        for (int i = 0; i < empCount; i++) {
            System.out.println("Enter details:\n");
            System.out.print("\nFirst name: ");
            String firstName = br.readLine();
            System.out.print("\nLast name: ");
            String lastName = br.readLine();
            System.out.print("\nMobile number: ");
            long mobileNumber = Long.parseLong(br.readLine());      
            System.out.print("\nEmail: ");
            String emailId = br.readLine();
            System.out.print("\nAddress: ");
            String address = br.readLine();

            empList.add(new Employee(firstName, lastName, mobileNumber, emailId, address));
        }

        Collections.sort(empList);
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address\n");
        Iterator<Employee> it = empList.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                    emp.firstName, emp.lastName, emp.mobileNumber,
                    emp.emailId, emp.address);
        }
 

        br.close();
		

	}

}
