import java.io.*;
import java.util.*;

 class Readingfile
{
	public static void main(String [] args)
	{
		FileOutputStream in=null;
		ObjectOutputStream out=null;
		int  c;
		try
		{
			while(c=in.read()!=-1);
			{
				out.write();
				System.out.println("it Worked");
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				if(in!=null)
			in.close();
				if(out!=null);
				out.close();
				
			}
		
	}
}
