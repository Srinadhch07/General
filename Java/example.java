import java.util.Scanner;

abstract class FoodOrder{
    abstract void calculateTotal(double amt);

    public void placeOrder(){
        System.out.println("Order placed Successfully.");
    }
}

class RegularOrder extends FoodOrder{
    public void calculateTotal(double amount){
        System.out.println("Regular amount :"+amount);
    }
}

class PremiumOrder extends FoodOrder{
    public void calculateTotal(double amount){
        amount += amount*0.1;
        System.out.println("Premium Amount :"+amount);
    }
}

public class example{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        double input = sc.nextDouble();
        System.out.println("Enter Type of Order: ");
        sc.nextLine();
        String ordertype = sc.nextLine();

        switch(ordertype.trim()){
            case "regular":
                RegularOrder insta = new RegularOrder();
                insta.placeOrder();
                insta.calculateTotal(input);
                break;
            case "premium":
                PremiumOrder insta1 = new PremiumOrder();
                insta1.placeOrder();
                insta1.calculateTotal(input);
                break;
        }
        
    }
}