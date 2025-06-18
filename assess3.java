// 1. odd and even values count in an array
// import java.util.*;
// public class assess3 {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         int oddno=0;
//         int evenno=0;
//         for(int i=0;i<n;i++){
//             if(a[i]%2!=0){
//                 oddno++;
//             }
//             else{
//                 evenno++;
//             }
//         }

//         System.out.println("odd count:"+oddno);
//         System.out.println("Even count:"+evenno);
//         sc.close();
//     }
// }

// 2. find the largest and smallest number in an array

// import java.util.*;
// public class arr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
        
//         int largest = a[0];
//         int smallest = a[0];
        
//         for (int i = 1; i < n; i++) {
//             if (a[i] > largest) {
//                 largest = a[i];
//             }
//             if (a[i] < smallest) {
//                 smallest = a[i];
//             }
//         }
        
//         System.out.println("Largest number: " + largest);
//         System.out.println("Smallest number: " + smallest);
        
//         sc.close();
//     }
// }

// 3. find the second largest and second smallest number in an array

// import java.util.*;  
// public class arr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();    
// int a[] = new int[n];
// for (int i = 0; i < n; i++) {
//     a[i] = sc.nextInt();
// }
// int small = a[0], secondSmall = a[1];
// int large = a[0], secondLarge = a[1];

// if (small > secondSmall) {
//     int temp = small;
//     small = secondSmall;
//     secondSmall = temp;
// }
// if (large < secondLarge) {
//     int temp = large;
//     large = secondLarge;
//     secondLarge = temp;
// }

// for (int i = 2; i < a.length; i++) {
//     int val = a[i];
//     if (val < small) {
//         secondSmall = small;
//         small = val;
//     } else if (val > small && val < secondSmall) {
//         secondSmall = val;
//     }

//     if (val > large) {
//         secondLarge = large;
//         large = val;
//     } else if (val < large && val > secondLarge) {
//         secondLarge = val;
//     }
// }

//         System.out.println("Second Smallest: " + (small != secondSmall ? secondSmall : "None"));
//         System.out.println("Second Largest: " + (large != secondLarge ? secondLarge : "None"));
//     }
// }

// 5. reverse of a array
// import java.util.*;
// public class arr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); 
//         int a[] = new int[n]; 
//         for (int i = 0; i < n; a[i++] = sc.nextInt()); 
//         int start = 0; 
//         int end = n - 1; 
//         while (start < end) { 
//             int temp = a[start]; 
//             a[start] = a[end]; 
//             a[end] = temp; 
//             start++; 
//             end--; 
//         }
//         System.out.print("Reversed Array: ");
//         for (int k : a) // print the reversed array
//             System.out.print(k + " ");
//     }
// }

//6. Search an element in array 
import java.util.*;
public class assess3 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int a[] = new int[n];
        for (int i = 0; i < n; a[i++] = sc.nextInt()); 
        int searchElement = sc.nextInt(); 
        boolean found = false;

        for (int i = 0; i < n; i++) { 
            if (a[i] == searchElement) { 
                System.out.println("Element found at index: " + i); 
                found = true; 
                break; 
            }
        }

        if (!found) { 
            System.out.println("Element not found");
        }
        
        sc.close(); 
    }
}