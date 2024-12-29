import java.util.Scanner;
 public class Ceaser_cipher{
    
    String str ="abcdefghijklmnopqrstuvwxyz ";
    char base[] = str.toCharArray();

    public  void encryption(String value, int key){
        key = key%26;
        char input[] = value.toCharArray();
        String ency = "";
        for(char i: input){
            int shift = str.indexOf(i)+key;
            ency +=base[shift];
        }  
        System.out.println("Encrpyted Text: "+ency);
        decryption(ency,key);
    }
    public void decryption(String value, int key){
        key = key%26;
        char input[] = value.toCharArray();
        String decry = "";
        for(char i: input){
            int shift = str.indexOf(i)-key;
            decry+= base[shift];
        }
        System.out.println("Decrypted text : "+decry);
    }

    public static void main(String[] args){
        Ceaser_cipher obj = new Ceaser_cipher();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String input = sc.nextLine();
        System.out.println("Enter Key");
        int key = sc.nextInt();
        obj.encryption(input,key);
        
        
    }
 }