import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;

public class HashSet1{
    public  static void main(String[] args){
     HashSet<String> list = new HashSet<>();
     list.add("a");
     list.add("c");
     list.add("b");   
     System.out.println(list);
     ArrayList<String> arrayList = new ArrayList<>(list);
     Collections.max(arrayList);
     System.out.println(list);

    }
}