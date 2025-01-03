import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
public class LinkedList2{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("abc");
        list.add("bz");
        list.add("bcinoi");
        list.add("ba");
        Collections.sort(list);        
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        // Coping list
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("");
        Collections.copy(list2,list);
        System.out.println(list2);
    }
}