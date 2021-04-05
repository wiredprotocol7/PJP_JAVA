

class employee implements Cloneable 
{
	private String name;
	
	public employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public employee clone() {
		try {
			return (employee) super.clone();
		} 
		catch (CloneNotSupportedException e) 
		{
			System.out.println("Cloning Error");
			return this;
		}		
	}
}
public class A04{
	

	public static void main(String[] args) 
	{
		employee emp = new employee("Lain");
		employee empclone = emp.clone();
		
		empclone.setName("Misato");
		
		System.out.println(empclone.getName());
		System.out.println(emp.getName());
	}

}
