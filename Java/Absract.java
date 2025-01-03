abstract class Order{
    int orderId;
    double orderAmount;
    abstract public void calculateTotal();
}

public class Absract  extends Order{
    public void calculateTotal(){
        System.out.println("Hello world");
    }
    public static void main(String[] args){
        Absract insta = new Absract();
        insta.calculateTotal();
    }
}