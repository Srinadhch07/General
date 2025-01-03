public class StringBuilder{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("hello");
        //StringBuilder ub = new StringBuilder("hello");
        sb.append(" World");
        sb.reverse();
        sb.insert(10," srinadh");
        sb.delete(10,15);
        System.out.println(sb);
    }
}