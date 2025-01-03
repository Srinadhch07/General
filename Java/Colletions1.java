// Working with LinkedList numbers

import java.util.Collections;
import java.util.*;

public class Collections1{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=10;i>0;i--){
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.reverse(list);
        int index = Collections.binarySearch(list,2);
        System.out.println(index);

        System.out.println(Collections.frequency(list,1));
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }
}