class hello{
    String name;
    public hello(String value){
        this.name = value;
        //System.out.println("Given Value:"+value);
    }
    public void Show_Name(){
        System.out.println("Name : "+this.name);
    }
}

public class Main extends hello{
    public Main(String name){
        super(name);
        //System.out.println("We're on Child Constructor.");
    }
    public static void main(String[] args){
        Main obj = new Main("Srinadh");
        obj.Show_Name();

    }
}