public class localvar
{
	public void show()
	{
	int a=10;
	System.out.println("a="+a);
	}
	public void dis()
	{
	int b=20;
	System.out.println("b="+b);
	}
	public static void main(String args[])
	{
		localvar obj1=new localvar();
		obj1.show();
		obj1.dis();
	}
	
}
