class class1{
    protected String name = "Srinadh";
    public  final void show(){
        System.out.println(name);
    }
}

class class2 extends class1{
    public void show(){
        
        System.out.println("Name: "+name);
    }
}
public class Modifiers{
    public static void main(String[] args){
        class2 obj = new class2();
        obj.show();
    }
}