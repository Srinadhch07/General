import java.util.ArrayList;
public class ArrayList1{
    public static void main(String[] args){
        String input[] ={"a","b","c"};
        ArrayList<String> list = new ArrayList<>();
        list.add("hi");
        for(String i: input){
            list.add(i);
        }
        System.out.println(list);
        list.add(2,"d");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.get(2);
        System.out.println(list);
        list.set(3,"z");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("a"));
        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));

        //String array[] = list.toArray();
        //System.out.println(array);
        //System.out.println(list.clear(0));
    
    }
}

