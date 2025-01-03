class class1{
     int value = 10;
     // Declaring final method
     public  void show(){
        System.out.println("Hi");
     }
}
public class final1 extends class1{
    public void show(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        class1 obj = new  class1();
        obj.value = 20;
        System.out.println(obj.value);
    }
}