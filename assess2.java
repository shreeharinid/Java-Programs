// Create a Basic Calculator using switch ( Divide by 0 not possible && precision upto 3 && make abs difference)
// import java.util.Scanner;
// public class cal {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a=sc.nextInt();
//         System.out.print("Enter operator (+, -, *, /): ");
//         char b=sc.next().charAt(0);
//         System.out.print("Enter second number: ");
//         int c=sc.nextInt();

//         switch (b) {
//             case '+':
//                 System.out.println("Result: "+(a+c));
//                 break;
//             case '-':
//                 System.out.println("Result: " +Math.abs(a-c));
//                 break;
//             case '*':
//                 System.out.println("Result: "+(a*c));
//                 break;
//             case '/':
//                 if (c!=0)
//                     System.out.printf("Result: %.3f\n",(float)a/c); 
//                 else
//                     System.out.println("Division by zero is not allowed.");
//                 break;
//             default:
//                 System.out.println("Invalid operator.");
//         }
//         sc.close();
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


//patterns
// import java.util.Scanner;
// public class assess2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//        //4
//         System.out.println("Fourth");
//         int n = sc.nextInt();
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < n; j++) {
//                 if(i%2==0){
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("# ");
//                 }
//             }
//             System.out.println();
//         }

//         //5
//         System.out.println("Fifth");
//         int co = 1;  
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == j) {
//                     System.out.print(1+" ");
//                 } else {
//                     co++;
//                     if (co > 9) co = 1;
//                     System.out.print(co+" ");
//                 }
//             }
//             System.out.println();
//         }

//         //6
//         System.out.println("Sixth");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == 0 || i == n - 1) {
//                     if (j == 0 || j == n - 1) {
//                         System.out.print("* ");
//                     } else {
//                         System.out.print("# ");
//                     }
//                 } else if (i == n / 2) {
//                     System.out.print("- ");
//                 } else {
//                     System.out.print("# ");
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }








