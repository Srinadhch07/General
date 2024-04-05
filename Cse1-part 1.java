package Package1;
import java.util.*;

public class Cse1
{
		Scanner read = new Scanner(System.in);

	Cse1()
	{
		System.out.println("Enter height of Triangle :");
		int n=read.nextInt();
		System.out.println("Enter base  of Triangle :");
		int m=read.nextInt();
		float sum=m*n*0.5f;
		System.out.println("Area of Triangle:"+sum);
	}


		void show()
		{
			System.out.println("Enter the Radius :");
			int rad=read.nextInt();
			float Area=3.14f*rad;
			System.out.println("Area of the circle : "+Area);
		}

		static public void main(String [] sri)
		{			
			Cse1  hi=new Cse1();				
			hi.show();
		}
}


