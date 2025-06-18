// 1. sum of last and first digit of a number & sum of last two digits and first two digits

// import java.util.Scanner;
// public class simple {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int last =n%100;
//         while(n>99){
//             n/=10;
//         }
//             System.out.println((n/10)+(last%10));
//             System.out.println(n+last);
//         }
// }
    

// 2. sum of the digits of a number upto 1 digit

// import java.util.Scanner;
// public class simple{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         while (n > 0) {
//             sum += n % 10;
//             n /= 10; 
//             if (sum > 9) {
//                 n = sum;
//                 sum = 0; 
//             }
//         }
//         System.out.println(sum);
//     }
// }


// 3.largest and smallest digit of a number

// import java.util.Scanner;
// public class simple {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int large=0, small=0;
//         while(num!=0) {
//             int digit=num%10;
//             if(digit>large) {
//                 large=digit;
//             }
//             if(digit<small || small==0) {
//                 small=digit;
//             }
//             num/=10;
//         }
//         System.out.println(large+" "+small);
//         sc.close();
//     }
// } 


// 4. i/p: 2 10 8 explain from 2 to 10 display the factors of 8 and its count as o/p: 2 4 8 3

// import java.util.Scanner;
// public class simple {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int start = sc.nextInt();
//         int end = sc.nextInt();
//         int num = sc.nextInt();
//         int count = 0;
//        for (int i = start; i <= end; i++) {
//             if (num % i == 0) {
//                 System.out.print(i + " ");
//                 count++;
//             }
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }







