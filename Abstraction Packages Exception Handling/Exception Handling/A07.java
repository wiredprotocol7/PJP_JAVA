import java.io.*;

@SuppressWarnings("serial")
class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India cannot be registered");
	}
}


public class UserRegistration
{
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");	
	}
	public static void main(String args[]) throws IOException
	{
		  	
		    BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
			//int len = Integer.parseInt(br.readLine());
		    System.out.print("Enter the name of user and country.\n");
	        String[] inp=br.readLine().split(",");
			String name = inp[0];
			String countryName = inp[1];
			UserRegistration registration = new UserRegistration();
			try {
				registration.registerUser(name, countryName);
			} 
			catch (InvalidCountryException e) {
				System.out.println(e.getMessage());
			}

	}
			
}
