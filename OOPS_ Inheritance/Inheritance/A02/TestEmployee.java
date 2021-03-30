public class TestEmployee  {
	
	public static void main(String args[])
	{
		Employee emp= new Employee("Jean",10000.00,2018,"NIS41251");
		System.out.print(emp.getname()+"\n");
		System.out.print(emp.getsalary()+"\n");
		System.out.print(emp.getyear()+"\n");
		System.out.print(emp.getNIS()+"\n");
	}

}
