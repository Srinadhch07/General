import java.util.*;
public class Arrays1<T>{
    public <T> void show(T item){
        T value=item;
        System.out.println(value);
    }
    public static void main(String[] args ){
        Integer array[] ={1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        
        Arrays.sort(array);
        for(Integer i: array){
            System.out.println(i);
        }
        
        Arrays1<String> obj = new Arrays1<>();
        obj.show("srinadh");

        Arrays1<Integer> obj2 = new Arrays1<>();
        obj.show(2);
    }
}