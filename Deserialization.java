
import java.io.*;
import static java.lang.System.out;
public class Deserialization
{
	public static void main(String [] sri) 
	{
		try
		{
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("stream.txt"));
			Student s=(Student)in.readObject();
			in.close();		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
