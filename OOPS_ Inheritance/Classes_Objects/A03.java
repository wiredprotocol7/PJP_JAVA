class Patient

{   
    private String patientName;
    private double height,weight;
    
    Patient(String name,double h,double w)
    {
    	patientName=name;
    	height=h;
    	weight=w;
    }
    
	double computeBMI() {
		
		return ( weight / ( height * height ) );
	}
 
}

public class A19
{
	public static void main(String args[])
	{
		
		Patient pat = new Patient("Ganyu",1.6,55);
		System.out.println(pat.computeBMI());
	}
}
