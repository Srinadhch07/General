public class globalvar
{
	int a=100;
	public void show()
	{
		System.out.println("a="+a);
		a+=10;
	}
	public void dis()
	{
		System.out.println("a="+a);
	}
	public static void main(String args[])
	{
		globalvar obj=new globalvar();
		obj.show();
		obj.dis();
	}
}
