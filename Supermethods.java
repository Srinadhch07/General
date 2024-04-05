class Super
{
	void sample()
	{
		System.out.println("hey hi !!!");
		
	}
}
class child extends Super
{
	void sample()
	{
		System.out.println("hi  heyyyy !!!");
		super.sample();
	}
}

public class Supermethods
{
	public static void main(String args [])
	{
		child obj=new child();
		obj.sample();
	}
}
