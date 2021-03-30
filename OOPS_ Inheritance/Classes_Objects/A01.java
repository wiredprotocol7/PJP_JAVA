class Box

{   double h,l,w;
    
    Box(double hi, double le, double wi) /*Parameterized constructor*/
    {
    	h=hi;
    	l=le;
    	w=wi;
    }
    
    double volume()
    {
    	return h*l*w;
    }

	
}

public class A19
{
	public static void main(String args[])
	{
		Box box= new Box(20,10,50);
		System.out.println(box.volume());
	}

}
