import java.util.Scanner;

public class jaggedarr {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][];
        for (int i = 0; i < r; i++) {
            int c=sc.nextInt();
            a[i]=new int[c];
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
