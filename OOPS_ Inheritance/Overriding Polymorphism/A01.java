class Fruit
{
	String name,taste;
	double size;
	

	
	
	void eat()
	{
		System.out.print("Fruitname Taste");
		System.out.println();
	}
}

class Apple extends Fruit
{
	Apple()
	{
		this.name="Apple";
		this.taste="Sweet";
	}
	void eat()
	{
		System.out.println();
		System.out.println("Name: "+ name);
		System.out.println();
		System.out.println("Taste: "+taste);
	}
}

class Orange extends Fruit
{
	Orange()
	{
		this.name="Orange";
		this.taste="Sour";
	}
	
	void eat()
	{
		System.out.println();
		System.out.println("Name: "+ name);
		System.out.println();
		System.out.println("Taste: "+taste);
	}
}

public class A01 {

	public static void main(String[] args) 
	{
		Fruit F= new Fruit();
		Orange O= new Orange();
		Apple A= new Apple();
		
		F.eat();
		A.eat();
		O.eat();

	}

}
