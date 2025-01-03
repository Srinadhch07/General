class class1{
    private String name;
    public class1(int a){
        System.out.println("Hi from second constructors");
    }
    public class1(){
        System.out.println("Hi! from Class1 constructor.");
    }
    
}

class class2 extends class1{
    public class2(){
        super(2);
        System.out.println("Hi! from Class2 Constuctor");
    }
}

public class Constructors1{
    public static void main(String[] args){
        class2 obj = new class2();
    }
}