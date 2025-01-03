public class Strings1{
    public static void main(String[] args){
        String alpha = "Hello";
        String beta = " World";
        System.out.println("Length of String: "+alpha.length());
        System.out.println("Character at index 3: "+alpha.charAt(3));
        System.out.println("Substring of of string :"+alpha.substring(0,1));
        System.out.println("String Concatination :"+(alpha+beta));
        System.out.println(alpha.indexOf("l"));
        System.out.println(alpha.toUpperCase()+"   "+alpha.toLowerCase());

    }
}