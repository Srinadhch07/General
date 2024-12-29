import java.util.Scanner;

public class substitution_cipher{
    String serial = "abcedfghijklmnopqrstuvwxyz";
    String reverse ="zyxwvutsrqponmlkjihgfedcba";

    char base[] = serial.toCharArray();
    char rebase[] = reverse.toCharArray();
    
    public void encryption(String value){
        char input[] = value.toCharArray();
        String enc_text ="";
        for(char i: input){
            int index = serial.indexOf(i);
            enc_text += rebase[index];
        }
        System.out.println("Encrpyted text: "+enc_text);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        substitution_cipher obj = new substitution_cipher();
        obj.encryption("abc");
    }
}