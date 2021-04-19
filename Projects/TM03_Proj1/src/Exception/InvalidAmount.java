  
package Exception;

@SuppressWarnings("serial")
public class InvalidAmount extends Exception{
	public InvalidAmount()
	{
		super();
		System.out.println("Enter Valid Amount");
	}
}