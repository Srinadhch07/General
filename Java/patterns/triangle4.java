public class trinagle4{
    public static void main(String[] args){
        int m=5;
        int n=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                if(true)
                System.out.print(" * ");
                else
                    System.out.print("   ");
                
            }
            System.out.println();
        }

System.out.println("\n\n\n");
        for(int i=m;i>=1;i--){
            for(int j=i;j>=1;j--){
                if(true)
                System.out.print(" * ");
                else
                    System.out.print("   ");
            }
                System.out.println();

        }
    }
}