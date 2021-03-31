class shape
{
	void draw()
	{
		System.out.print("Drawing Shape");
		System.out.print("\n");
		
	}
	void erase()
	{
		System.out.print("Erasing Shape");
		System.out.print("\n");
	}

}

class Circle extends shape
{
	void draw()
	{
		System.out.print("Drawing Circle");
		System.out.print("\n");
		
	}
	void erase()
	{
		System.out.print("Erasing Circle");
		System.out.print("\n");
	}
}

class Triangle extends shape
{
	void draw()
	{
		System.out.print("Drawing Triangle");
		System.out.print("\n");
		
	}
	void erase()
	{
		System.out.print("Erasing Triangle");
		System.out.print("\n");
	}
}

class Square extends shape
{
	void draw()
	{
		System.out.print("Drawing Square");
		System.out.print("\n");
		
	}
	
	void erase()
	{
		System.out.print("Erasing Square");
		System.out.print("\n");
	}
}

public class A19 {

	public static void main(String[] args) 
	{
		shape s= new shape();
		s.draw();
		s.erase();
		Circle sc= new Circle();
		sc.draw();
		sc.erase();
		Triangle st= new Triangle();
		st.draw();
		st.erase();
		Square ss= new Square();
		ss.draw();
		ss.erase();

	}

}
