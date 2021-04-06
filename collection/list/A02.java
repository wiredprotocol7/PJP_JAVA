import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	private int Id;
	private String Name, email, gender;
	private float salary;
	
	Employee(int Id, String Name, String Email, String Gender, float Salary) {
		this.Id = Id;
		this.Name = Name;
		this.email = Email;
		this.gender = Gender;
		this.salary = Salary;
	}
	
	public int getId() {
		return Id;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public float getSalary() {
		return salary;
	}

	void GetEmployeeDetails() {
		System.out.println("Employee Id:" + Id + ", Name=" + Name + ", Email=" + email 
				+ ", Gender=" + gender + ", Salary=" + salary );
	}
}

class EmployeeLIST {
	List<Employee> emplist = new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		return emplist.add(e);
	}
	
	public boolean deleteEmployee(int Id) {
		boolean status = false;
		
		Iterator<Employee> i = emplist.iterator();
		
		while (i.hasNext()) {
			Employee emp = i.next();
			if (emp.getId() == Id) {
				status = true;
				i.remove();
			}
		}
		
		return status;
	}
	
	public String showPaySlip(int Id) {
		String paySlip;
		
		for (Employee e : emplist) {
			if (e.getId() == Id) {
				paySlip = "Pay slip for employee id " + Id + " is " +
						e.getSalary();
			}
		}
		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] emparray = new Employee[emplist.size()];
		for (int i = 0; i < emplist.size(); i++)
			emparray[i] = emplist.get(i);
		return emparray;
	}
}

public class Assignment02 {

	public static void main(String[] args) {

		EmployeeLIST  emplist = new EmployeeLIST();
		
		Employee emp1 = new Employee(7101, "X", "x@gmail.com", "Male", 25000);
		Employee emp2 = new Employee(5102, "Y", "y@mail.com", "Female", 30000);
		Employee emp3 = new Employee(4103, "Z", "z@yahoomail.com", "Male", 20000);

		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
;

		for (Employee emp : empDb.listAll())
			emp.GetEmployeeDetails();
		
		System.out.println();
		empDb.deleteEmployee(7101);
		
		for (Employee emp : empDb.listAll())
			emp.GetEmployeeDetails();
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(4103));
	}

}
