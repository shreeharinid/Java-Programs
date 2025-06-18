import java.util.Scanner;

public class panagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int a[]=new int[256];
        String low=str.toLowerCase();
        boolean flag=false;

        for(int i=0;i<low.length();i++){
            a[low.charAt(i)]++;
        }

        for (int i = 97; i < 123; i++) {
            if(a[i]==0){
                System.out.println("not a panagram");
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.print("is paragram");
        }
        sc.close();
    }
}
