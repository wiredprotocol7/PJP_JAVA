package Exception;

@SuppressWarnings("serial")
public class InvalidDay extends Exception{
	public InvalidDay()
	{
		super();
		System.out.println("Invalid Number of days.");
	}
}