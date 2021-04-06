import java.util.Iterator;
import java.util.Vector;

class EmployeeList {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public EmployeeList(int id, String name, String address, Double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
}

public class A07 {

	public static void main(String[] args) {

		Vector<EmployeeList> list = new Vector<>();
		
		list.add(new EmployeeList(1, "A", "Seoul", 77000.06));
		list.add(new EmployeeList(2, "B", "Tokyo", 330000.04));
		list.add(new EmployeeList(3, "C", "Shanghai", 250700.40));
		list.add(new EmployeeList(14, "D", "Shenzen", 403000.20));
		
		Iterator<EmployeeList> itr = list.iterator();
		while (itr.hasNext()) 
			System.out.println(itr.next());
	}

}
