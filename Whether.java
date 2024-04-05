import java.util.*;
public  class Whether
{
	public static void main(String[] sri)
	{
		float t;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter temperature in fohrenheit : ");
		t=r.nextInt();
		t=((t-32)*5/9);
		System.out.println("Temperature in celsius : "+t);

		
	}
}
