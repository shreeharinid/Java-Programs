// vowels count
// public class string {
//     public static void main(String[] args){
//         String a="alphabetical input";
//         String v="aeiouAEIOU";
//         int c=0;
//         for(int i=0;i<a.length();i++){
//             if(v.indexOf(a.charAt(i)) != -1)
//                 c++;
            
//         }
//         System.out.println(c);
//     }
    
// }

// 1. i/p: a2b3c4D1 o/p:aabbbccccD

import java.util.Scanner;

public class string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i+=2){
            char d=s.charAt(i);
            int c=s.charAt(i+1)-'0';
            for(int j=0;j<c;j++){
                res+=d;
            }
        }
        System.out.println(res);
        sc.close();
    }
}



// words count in the string
// import java.util.Scanner;
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String str[] = s.split(" ");
//         System.out.println("Words count:"+str.length);
        
//     }
// }

// Reverse words in a string
// class Solution {
//     public String reverseWords(String s) {
//       s = s.trim();
//       String str[]=new String[10000];
//       String w="";
//       int in=0;
//       String v="";
//       for(int i=0;i<s.length();i++){
//         char c=s.charAt(i);
//         if(c!=' '){
//             w=w+c;
//         }else{
//             if (!w.equals("")) {
//             str[in++]=w;
//             w="";
//              }
//         }
//       }
//       str[in++]=w;
//       for(int i=in-1;i>=0;i--){
//           v += str[i];
//           if (i != 0) 
//           v += " ";
//       }
//       return v;
//     }
// }