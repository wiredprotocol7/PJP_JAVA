import java.io.*;



@SuppressWarnings("serial")
class Employee implements Serializable 
{
	private String name;
	private String dob;
	private String department;
	private String designation;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class A01 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.setName(br.readLine());
		System.out.print("Enter D.O.B.: ");
		emp.setDob(br.readLine());
		System.out.print("Enter department: ");
		emp.setDepartment(br.readLine());
		System.out.print("Enter designation: ");
		emp.setDesignation(br.readLine());
		System.out.print("Enter salary: ");
		emp.setSalary(Double.parseDouble(br.readLine()));		
		FileOutputStream foone = new FileOutputStream("data");
		ObjectOutputStream ooone = new ObjectOutputStream(foone);
		ooone.writeObject(emp);		
		FileInputStream ftwo = new FileInputStream("data");
		ObjectInputStream otwo = new ObjectInputStream(ftwo);
		Employee emp2 = (Employee) otwo.readObject();		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDob());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
	}

}
