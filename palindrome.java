import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int f=0;
        for(int i=0,j=s.length()-1;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                f=1;
                break;
            }
        }
        System.out.println(f==0?"Palindrome":"Not");
    }
}
