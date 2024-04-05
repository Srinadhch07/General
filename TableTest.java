import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
class A extends JFrame
{
	public A()
	{
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GridLayout g=new GridLayout(0,3);
	setLayout(g);
	try
	{
		FileInputStream fin=new FileInputStream("C:\\Test\\hello.txt");
		Scanner sc=new Scanner(fin).useDelimiter(",");
		String[] array;
		String a;
		while(sc.hasNextLine())
		{
			a=sc.nextLine();
			array=a.split(",");
			for(String i:array)
			{
				add(new JLabel(i));
			}
		}
	}
		catch(Exception ex){}
	/*setDefaultLookAndFeeDecorated(true);*/
	pack();
	setVisible(true);
	}
}

public class TableTest{
public static void main(String[] sri)
{	A a=new A();
}
}