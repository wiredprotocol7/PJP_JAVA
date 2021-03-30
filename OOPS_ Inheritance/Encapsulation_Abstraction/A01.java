class Author
{
	protected String name,email;
	protected char gender;
	
	Author(String name,String email, char gender)
	{
		this.email=email;
		this.name=name;
		this.gender=gender;
	}
	
	
	
}

class Book
{
	protected String name;
	protected Author author;
	protected double Price;
	protected int qtyInStock;
	
	Book(String name, Author author, double price, int qtyInStock)
	{
		this.name=name;
		this.author=author;
		this.Price=price;
		this.qtyInStock=qtyInStock;
	}
}
public class A01
{
	public static void main(String args[])
	{
		Author auth=new Author("Isayama","isayama@line.com",'M');
		Book book=new Book("Attack on Titan",auth,680.50,70);
		System.out.println("The details of Book: \n");
		System.out.println("The name of book:"+book.name+".\n"+"The author of book:"+book.author.name+".\n"+"The price of book:"+book.Price+".\n"+"The stock of book:"+book.qtyInStock+".\n");
		System.out.println("The name of author: "+book.author.name+".\n"+"The email of author is "+book.author.email+".\n"+"The gender of author: "+book.author.gender+".\n");	
		
	}
}
