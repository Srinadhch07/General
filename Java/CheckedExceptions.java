import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CheckedException{
    public static void main(String[] args){
        String filename = "Absract.java";

        try{
            FileReader filereader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found: "+filename);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}