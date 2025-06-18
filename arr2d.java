// import java.util.*;
// public class TwoDCompileTime {
// 	    public static void main(String[] args) {
// 	     int row=3,column=3;
// 	     int a[][]= {   {1,2,3},
// 	                    {4,5,6},
// 	                    {7,8,9}    };	
// 	     int b[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}}; 
// 	     int e[][]= new int[row][column];
// 	     e[0][0]=12;      e[0][1]=23;
// 	     e[0][2]=34;
// 	     e[1][0]=45;
// 	     e[1][1]=56;
// 	     e[1][2]=67;
// 	     e[2][0]=78;
// 	     e[2][1]=89;
// 	     e[2][2]=90;
// 	   int f[][];
// 	     f= new int[3][3];
	     
// 	     // int b[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}}; 
// 	    int c[][]= {{1,2,3},{4,5,6},{7,8,9}};
// 	    /* int d[][]= new int[row][column]{{1,2,3},{4,5,6},{7,8,9}}; 
// 	     error: array creation with both dimension expression and
// 	    initialization is illegal*/
	     
// 	     for(int i[]: a ) {
// 	    	 for(int j :i) {
// 	    System.out.print(j+" ");
// 	    	 }
// 	    	 System.out.println();
// 	     }
	        
// 	  }
// 	}
 
//user input
// import java.util.*;
// public class TwoDRunTime {
// 	public static void main(String[] args) {
// 	     Scanner sc= new Scanner(System.in);
// 	     // r to store row size c to store column size
// 	      int r =sc.nextInt(), c= sc.nextInt();
// 	      // declaring array with r * c Size 
// 	      int a[][]= new int[r][c];
	      
// 	      // i loop to select row
// 	      for(int i=0   ;i<r ;i++){
//              // j  loop to select column
// 	    	  for(int j =0 ; j< c ;j++){
	    		  
// 	             a[i][j]=sc.nextInt();
// 	          }
// 	      }
	      
// 	      for(int i=0;i<a.length;i++){
// 	          for(int j=0;j<a[i].length;j++){
// 	           System.out.print(a[i][j]+" ");
// 	          }
// 	           System.out.println();
	          
// 	        }
	             
// 	    }
// 	}



// addition in 2d array
import java.util.*;
public class arr2d{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int r=sc.nextInt();
        int c=r;
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        //row addition
        for(int i=0;i<r;i++){
            int sumr=0;
            for(int j=0;j<c;j++){
                sumr+=a[i][j];
            }
            System.out.print(sumr+" ");
        }
        System.out.println();
        //column addition
        for(int i=0;i<r;i++){
            int sumc=0;
            for(int j=0;j<c;j++){
                sumc+=a[j][i];
            }
            System.out.print(sumc+" ");
        }
        System.out.println();

        //diagonal addition
        int sumd=0;
        int sumri=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sumd+=a[i][j];
                }
                if(i+j==r-1){
                    sumri+=a[i][j];
                }
            }
        }
        System.out.print(sumd+" ");
        System.out.println();
        System.out.print(sumri+" ");
        System.out.println();

        //greatest number in row and max out of it
      
        }
        sc.close();
    }
