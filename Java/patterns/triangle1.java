public class trinagle1{
    public static void main(String[] args){
        int m=5;
        int n=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                if(i==1 || i==m || j == 1 || j == n || i==j)
                System.out.print(" * ");
                else
                    System.out.print("   ");
                
            }
            System.out.println();
        }
    }
}