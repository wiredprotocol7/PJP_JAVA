public class Assignment_three
{
	public static void main(String[] args) 
	{
		
		if(args.length==0)
		{
			System.out.print("No Values");
		}
		
		else
		{ String ans=args[0];
			for (int j=1; j<args.length;j++)
			{
				ans+=(","+args[j]);
			}
			System.out.println(ans);
		}
			 
	}
}
