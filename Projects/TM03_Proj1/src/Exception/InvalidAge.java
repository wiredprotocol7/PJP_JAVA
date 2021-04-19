package Exception;

@SuppressWarnings("serial")
public class InvalidAge extends Exception{
	public InvalidAge()
	{
		super();
		System.out.println("Please Enter Valid Age");
	}
}