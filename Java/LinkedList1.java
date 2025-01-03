import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        System.out.println(list);
        list.addFirst("b");
        System.out.println(list);
        list.addLast("c");
        System.out.println(list);
        list.get(0);
        System.out.println(list);
        list.set(1,"d");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        ListIterator itr = list.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }




    }
}