package JavaPatterns;

public class triangle {
    public static void main(String[] args){
        int i,j;
        int n=6;
        for ( i=1; i<=n; i++){
            for (j =1; j<i; j++){
                System.out.print(" ");
            }
            for (j=i; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
