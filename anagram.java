import java.util.Scanner;

public class anagram {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int a[]=new int[256];
        int flag=0;

        for (int i = 0; i < str1.length(); i++) {
            a[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            a[str2.charAt(i)]--;
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0){
                System.out.println("False");
                flag=1;
            }
        }

        if(flag==0){
            System.out.println("True");
        }

    }
    
}
