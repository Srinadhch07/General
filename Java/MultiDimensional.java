public class MultiDimensional{
    public static void main(String[] args){
       int n1[][] = new int[5][5];
       for(int i=0;i<n1.length;i++){
        for(int j=0;j<=i;j++){
            n1[i][j]=j+1;
            System.out.print(n1[i][j]+" ");
        }
        System.out.println();
       }
    }
}