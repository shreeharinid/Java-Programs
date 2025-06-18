// 1. discount on purchase above Rs. 2000
// import java.util.Scanner;

// public class assess {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int pur = sc.nextInt();
//         if(pur>2000){
//             int dis = pur-500;
//             System.out.println("You get a discount of Rs. " + dis);
//         }
//     }
    
// }

// 2. last digit is even and last before digit is 7
// import java.util.Scanner;            
// public class assess {
//     public static void main(String[] args) {             
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int last= n % 10;
//         int second = (n / 10) % 10;     
//         if (last % 2 == 0 && second == 7) {
//             System.out.println("The last digit is even and the second last digit is 7.");
//         } else {
//             System.out.println("Invalid input.");
//         } 
//         sc.close();
//         }
//     }

// 3. Find sum of digit of a numbers last 2 digit
// import java.util.Scanner;
// public class assess {            
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int last = n % 10;
//         int secondLast = (n / 10) % 10;      
//         int sum = last + secondLast;
//         System.out.println(sum);
//         sc.close();
//     }                
// }

// 4.  eligible to vote or not
// import java.util.Scanner;
// public class assess {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if (age >= 18) {
//             System.out.println("Eligible to vote");  
//         } else {
//             System.out.println("Not eligible");
//         }
//         sc.close();
//     }
// }

// 5.  i/p: h o/p: head  i/p: t o/p: tail i/p: H o/p: HEAD
// import java.util.Scanner;
// public class assess {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         char ch = sc.next().charAt(0);
//         if (ch == 'h') {
//             System.out.println("head");
//         } else if(ch == 'H'){
//             System.out.println("HEAD");
//         }else if (ch == 't') {
//             System.out.println("tail");      
//         } else {
//             System.out.println("Invalid input");
//         }
//         sc.close();
//     }
// }

// 6.  train ticket discount : child, adult, senior citizen
// import java.util.Scanner;
// public class assess {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         int ticket = 500;
//         if (age < 12) {
//             System.out.println("Child ticket:"+ticket/2);
//         } else if (age >= 12 && age < 60) {
//             System.out.println("Adult ticket:"+ticket);
//         } else if (age >= 60) {
//             System.out.println("Senior citizen ticket:"+(ticket-300));
//         } else {
//             System.out.println("Invalid age");
//         }
//         sc.close();
//     }
// }

// 7.  i/p: A        i/p: f      o/p: Vowel    o/p: Consonent
// import java.util.Scanner;
// public class assess {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         char ch = sc.next().charAt(0);
//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//             ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//             System.out.println("Vowel");
//         } else {
//             System.out.println("Consonant");
//         }
//         sc.close();
//     }
// }





