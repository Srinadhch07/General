interface animal{
    public void shout();
}

class activity{
    public void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends activity implements animal {
    public void shout(){
        System.out.println("bOw Bow");
    }
}

public class interfaces{
    public static void main(String[] args){
        Dog insta = new Dog();
        insta.shout();
        insta.eat();
    }
}