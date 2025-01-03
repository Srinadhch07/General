import java.io.IOException;
public class Exceptions1{
    public static void test() throws IOException{
        throw new IOException("Caught IO Exception");
        
    }
    public static void main(String[] args){
        try{
            test();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}