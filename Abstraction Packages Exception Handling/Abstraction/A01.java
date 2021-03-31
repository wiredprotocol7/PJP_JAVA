abstract class GeneralBank
{
	double savings,fixed;

	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
}


class ICICIBank extends GeneralBank
{

	
	double getSavingsInterestRate()
	{
		savings=4;
		return savings;
	}
	double getFixedDepositInterestRate()
	{
		fixed=8.5;
		return fixed;
	}
}

class KotMBank extends GeneralBank
{

	double getSavingsInterestRate()
	{
		savings=6;
		return savings;
	}
	double getFixedDepositInterestRate()
	{  fixed=9;
		return fixed;
	}
}


public class A01 {

	public static void main(String[] args) throws IOException 
	{
		ICICIBank i=new ICICIBank();
		System.out.println(i.getFixedDepositInterestRate());
		System.out.println(i.getSavingsInterestRate());
		System.out.println();
		KotMBank k=new KotMBank();
		System.out.println(k.getFixedDepositInterestRate());
		System.out.println(k.getSavingsInterestRate());
		System.out.println();
		GeneralBank g=new KotMBank();
		System.out.println(g.getFixedDepositInterestRate());
		System.out.println(g.getSavingsInterestRate());
		System.out.println();
		GeneralBank h=new ICICIBank();
		System.out.println(h.getFixedDepositInterestRate());
		System.out.println(h.getSavingsInterestRate());
		System.out.println();
		
	}

}
