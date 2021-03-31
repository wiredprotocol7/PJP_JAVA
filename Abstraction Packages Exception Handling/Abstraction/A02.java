import java.util.Random;

abstract class Compartment
{
	public abstract String notice();
}


	
class FirstClass extends Compartment {

	
	public String notice()
	{
		
		return "You are in First Class Compartment";
	}
	
}

class Ladies extends Compartment {


	public String notice() 
	{
		
		return "You are in Ladies Compartment";
	}
	
}

class General extends Compartment {


	public String notice()
	{
	
		return "You are in General Compartment";
	}
	
}

class Luggage extends Compartment {


	public String notice() 
	{
	
		return "You are in Lugguage Compartment";
	}
	
}


public class A02 {

	public static void main(String[] args) throws IOException 
	{
		Compartment[] compartments = new Compartment[10];

	
		
	    	for (int i = 0; i < 10; i++) 
	    	{
	    		Random random = new Random();
	    		int ran = 1 + random.nextInt(4);
	    	
	    		if (ran == 1)
	    			compartments[i] = new Luggage();
	    		else if (ran == 2)
	    			compartments[i] = new Ladies();
	    		else if (ran == 3)
	    			compartments[i] = new General();
	    		else if (ran == 4)
	    			compartments[i] = new FirstClass();
	    	
	    		System.out.println(compartments[i].notice());
	    	}
	}

}
