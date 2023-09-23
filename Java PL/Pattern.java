/* 

   *   
  ***  
 ***** 
*******
*******
 *****
  ***
   *
   * 
*/
/*
public class Pattern {
    public static void diamond(int n ){
        //1st half 
        int k = 0;
        for (int i = 1 ; i<= n ; i ++){
            for (int j = 1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int l = 1; l <= (k+i);l++){
                System.out.print("*");
            }
            k++;
            System.out.println();
        }
        //2nd half
        int m = n-1;
        for (int i = n ; i>=1 ; i --){
            for (int j = 1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int l = 1; l <= (m+i);l++){
                System.out.print("*");
            }
            m--;
            System.out.println();
        }
    }
    public static void main(String args[]){
        diamond(4);
    }
}*/


/*  
    *****
   *   * 
  *   *  
 *   *   
***** 

*/
/* 
public class Pattern{
    public static void solidRhombus(int n){
        for (int i = 1 ; i<=n ; i++){
            //Spaces
            for (int j = 1 ;j<=(n-i);j++ ){
                System.out.print(" ");
            }
            if (i==1 || i == n){
                System.out.println("*****");
            }  else{
                System.out.println("*   *");
            }
        }
    }
    public static  void main(String args[]){
        Pattern.solidRhombus(5);
    }
}*/


/* 
    *****
   ***** 
  *****  
 *****   
*****    

*/
/*public class Pattern{
    public static void solidRhombus(int n){
        for (int i = 1 ; i<=n ; i++){
            //Spaces
            for (int j = 1 ;j<=(n-i);j++ ){
                System.out.print(" ");
            }
            System.out.println("*****");   
        }
    }
    public static  void main(String args[]){
        Pattern.solidRhombus(5);
    }
}*/

/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
*/
/*
public class Pattern{
    public static void butterfly(int n){
        for (int i = 1 ; i<=n ; i++){
            //1st half 

            //stars
            for (int j=1 ; j<=i;j++){
                System.out.print("*");
            }

            //spaces 
            for (int j = 1 ; j<= 2*(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for (int j=1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
        for (int i = n;i>=1;i--){
            
            //stars
            for (int j=1 ; j<=i;j++){
                System.out.print("*");
            }

            //spaces 
            for (int j = 1 ; j<= 2*(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for (int j=1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        Pattern.butterfly(4);
    }
}
*/



/*
1
01
101
0101
*/
/* 
public class Pattern{
    public static void main(String args[]){
        int n = 6;
        for (int i = 1 ; i<=n;i++){
            if (i%2!=0){
                for (int j = 1 ; j<=i ; j++){
                    if (j%2!=0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }     
                }System.out.println();

            }else{
                for (int k = 1; k<=i;k++){
                    if (k%2!=0){
                        System.out.print("0");
                    }else{
                        System.out.print("1");
                    } 
                }System.out.println();
            }

            }System.out.println();
        }
    }*/




/*
1 
2 3
4 5 6
7 8 9 10
*/
/*public class Pattern{
    public static void main(String args[]){
        int n = 4;
        int num = 1;
        for(int i = 1 ; i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}*/


/* 
   *
  **
 ***
****

*/
/*
public class Pattern{
    public static void main(String args[]){
        int n = 4;
        for (int i = 1 ; i<=n;i++){
            for(int j = i;j<n;j++){
                System.out.print(' ');
            }
            for (int k = 1;k<=i;k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}*/


/* WAP to print this pattern
*****
*   *
*   *
*****
*/
/* 
public class Pattern{
    public static void main(String args[]){
        int n = 4;
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j <= 5 ; j++){

                if (i == 1 || i == 4 || j == 1 || j == 5){
                    System.out.print('*');

                }else{
                    System.out.print(' ');

                }
            }System.out.println();
        }
    }
}*/
/*          1
        2   3   4
    5   6   7   8   9
10  11  12  13  14  15  16
 */
/* 
public class Pattern {
    public static void main(String[] args) {
        int n = 4; 
        int num = 1; 

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}*/

/*
 Program to print this pattern
 ****
 ***
 **
 *
 */


 /*
 import java.util.*;
 public class Pattern{
 public static void main (String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter no. of lines : ");
 int n = sc.nextInt();
 
 for (int i=1; i<=n;i++){
 for(int j = 1;j<=((n-i)+1);j++){
 System.out.print("*");
 }System.out.println();
 }
 }
 }

*/
/*
 To print this pattern
 
 *
 **
 ***
 */
/*
 import java.util.*;
 public class Pattern{
 public static void main (String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of lines : ");
 int n = sc.nextInt();
 
 for (int i = 1 ; i<=n;i++){
 for (int j = 1;j<=i;j++){
 System.out.print("*");
 }
 System.out.println();
 }
 }
 }
 */