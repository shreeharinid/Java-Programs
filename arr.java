// // 1. odd and even index sum, odd and even number sum, odd index even number sum, even index odd number sum

// import java.util.*;
// public class arr {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         int oI=0;
//         int eI=0;
//         int oddno=0;
//         int evenno=0;
//         for(int i=0;i<n;i++){
//             if(i%2!=0){
//                 oI+=a[i];
//             }
//             else{
//                 eI+=a[i];
//             }
//             if(a[i]%2!=0){
//                 oddno+=a[i];
//             }
//             else{
//                 evenno+=a[i];
//             }
//         }
//         System.out.println("Odd index sum: "+oI);
//         System.out.println("Even index sum: "+eI);

//         System.out.println("odd Number Sum:"+oddno);
//         System.out.println("Even Number Sum:"+evenno);

//         int oe=0;
//         int eo=0;
//         for(int i=0;i<n;i++){
//             if(i%2!=0){
//                 if(a[i]%2==0){
//                     oe+=a[i];
//                 }
//             }
//             else{
//                 if(a[i]%2!=0){
//                     eo+=a[i];
//                 }
//             }
//         }

//         System.out.println("Odd Even Sum:"+oe);
//         System.out.println("Even Odd Sum:"+eo);

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

//another method

// import java.util.*;
// public class Main{
// public static void main(String []rt){
//  Scanner sc= new Scanner(System.in);
//  int n = sc.nextInt();
//   int a[]= new int[n];
// for(int i=0;i<n;a[i++]=sc.nextInt());

// System.out.print("Before Sort : ");
// for(int k:a) System.out.print(k+" ");

//   Arrays.sort(a);
//   System.out.println();
  
//   System.out.print("After Sort :  ");
// for(int k:a) System.out.print(k+" ");
  
//   int smax = a[n-1] , i= n-1;
//   while(a[i] == smax){
//     i--;
//   }
//   smax= a[i];
  
//   int smin = a[0];
//   i=0;
//   while(a[i] == smin){
//     i++;
//   }
//   smin=a[i];
//   System.out.println("\nSecond Max is : "+smax);
//   System.out.print("Second Min is : "+smin);
  

// }
// }

// 4. find the position of a key in an array in a given direction (forward or reverse)

// import java.util.*;
// public class Main{
// public static void main(String []rt){
//  Scanner sc= new Scanner(System.in);
//  int n = sc.nextInt(); // length of array
 
//  int key = sc.nextInt(); // key to search 
 
//   char dir = sc.next().charAt(0); // direction 
  
//   int a[]= new int[n]; // array declaration
  
// for(int i=0;i<n;a[i++]=sc.nextInt()); // array input 

//    int pos =-1; // initialising pos as -1 if key not found pos remains as -1
   
// if( dir == 'F' ||dir == 'f'){ // if chosen direction is Forward
//   for(int i=0;i<n;i++){ // traversal from 0 index
//      if(a[i] == key){   // key is there or not condition
//         pos = i+1;  // if key is found pos will be assigned with index+1 for position
//         break; // we found the key so to stop further checking break
//      }  
//    }
// System.out.print(pos);
// }
// else if(dir  == 'R' || dir == 'r'){ // if chosen direction is Reverse
//   for(int i=n-1;i>=0;i--){// traversal from n-1 index
//       if(a[i] == key){ // key is there or not condition
//         pos = i+1;   // if key is found pos will be assigned with index+1 for position
//          // if u want result pos from Reverse as Forward pos= n-i
//         break;// we found the key so to stop further checking break
//       }  
//    }
// System.out.print(pos);
// }
// else 
//    System.out.print("Inavlid char");

// }
// }

// 5. reverse of a array
import java.util.*;
public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // length of array
        int a[] = new int[n]; // array declaration
        for (int i = 0; i < n; a[i++] = sc.nextInt()); // array input
        int start = 0; // starting index
        int end = n - 1; // ending index
        while (start < end) { // loop until start index is less than end index
            int temp = a[start]; // store the value at start index in temp
            a[start] = a[end]; // assign the value at end index to start index
            a[end] = temp; // assign the value in temp to end index
            start++; // increment start index
            end--; // decrement end index
        }
        System.out.print("Reversed Array: ");
        for (int k : a) // print the reversed array
            System.out.print(k + " ");
    }
}


// leader numbers of array
for(int i=0;i<n;i++){
   int f=0;
    for(j=i+1;j<n;j++){
        if(a[i]<a[j]){
            f=1;
            break;
        }
    }
    if(f==0){
        System.out.print(a[i]+" ");
    }
}