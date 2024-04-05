public class staticvar
{
	int a,b;
	static int c;
	staticvar(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void show()
	{
		System.out.println("a="+a+"\nb"+b+"\nc="+c);
	}
	public static void main(String args[])
	{
		staticvar obj=new staticvar(100,200);
		obj.show();
		staticvar.c=-10;
		obj.show();
	}
}
