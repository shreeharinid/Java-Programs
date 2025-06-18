import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student name: "); // Prompt before reading
        String a = sc.nextLine();
        int m1, m2, m3, m4, m5;
        System.out.print("M1: ");
        m1 = sc.nextInt(); 
        System.out.print("M2: ");
        m2 = sc.nextInt();
        System.out.print("M3: ");
        m3 = sc.nextInt();
        System.out.print("M4: ");
        m4 = sc.nextInt();
        System.out.print("M5: ");
        m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double avg = total / 5.0;
        System.out.println("Hi! " + a);
        System.out.println("Your Total: " + total);
        System.out.println("Avg: " + avg);  
        sc.close();               
    }
}

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//    Scanner sc= new Scanner(System.in);
   
//    int diamater = sc.nextInt();
//    /*find the area of circle */
//    float r = diamater/2.0f;
//    System.out.println((float)(3.14*r*r));
//    System.out.printf("%.3f",3.14*r*r);
//    float area = 3.14f * r * r;
//    System.out.println(area);
//    sc.close();
//   }
// }

