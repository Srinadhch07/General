interface lanaguage
{
	void getdata(String name);
}
class Sample implements lanaguage
{
	public	void getdata(String name)
	{
		System.out.println("Name :"+name);
	}
}
public class Interface
{
	public static void main(String [] args)
	{
		Sample obj=new Sample();
		obj.getdata("SRINADH");
	}
}
