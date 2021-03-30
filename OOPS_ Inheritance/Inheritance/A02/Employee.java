public class Employee extends Person
{
	double salary;
	int year;
	String NIS;
	
	Employee(String name,double salary,int year,String NIS)
	{
		this.name=name;
		this.salary=salary;
		this.year=year;
		this.NIS=NIS;
		
	}
	
	public String getname()
	{
	   return name;
	}


	public double getsalary() 
	 {
		return salary;
	 }

	public int getyear ()
	 {
		return year;
	 }

	public String getNIS()
	{
		return NIS;
		}
}
