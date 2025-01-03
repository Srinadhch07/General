import java.util.Scanner;
public class MaxNumber{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int value = sc.nextInt();
        int total=0;
        for(int i=0;i<=value;i++){
            total += (i%2==0) ? i: 0;
        }
        System.out.println("Total Value :"+total);
    }
}