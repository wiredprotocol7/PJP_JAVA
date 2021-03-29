public class Assignment_six
{
	public static void main(String[] args) 
	{
	
		if (args[0].equals("Male"))
		{
			if ((Integer.parseInt(args[1])>=1) & (Integer.parseInt(args[1])<=58))
			{
				System.out.print("8.4%");
			}
			else if((Integer.parseInt(args[1])>=59) & (Integer.parseInt(args[1])<=100))
			{
				System.out.print("10.5%");
			}
		}
		else if (args[0].equals("Female"))
		{
			if (Integer.parseInt(args[1])>=1 & Integer.parseInt(args[1])<=58)
			{
				System.out.print("8.2%");
			}
			else if(Integer.parseInt(args[1])>=59 & Integer.parseInt(args[1])<=100)
			{
				System.out.print("9.2%");
			}
		}			

			 
	}
}
