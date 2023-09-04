







/*import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int limit = sc.nextInt();
        
        int first = 0;
        int second = 1;
        
        System.out.println("Fibonacci Series until the last number is less than " + limit + ":");
        System.out.print(first + " " + second + " ");
        
        int next = first + second;
        
        while (next < limit) {
            System.out.print(next + " ");
            first = second;
            second = next;
            next = first + second;
        }
        
        System.out.println();
    }
}*/









/*import java.util.*;
public class demo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        demo obj = new demo();
        obj.isNumberPalindrome(n);
    }
 public void isNumberPalindrome(int number ){
    int n = number;
    String str = Integer.toString(n);
    int len = str.length();
    String str1 = "";
    for (int i = len-1; i>=0;i--){
        char ch = str.charAt(i);
        str1 += ch;
    }
     if (str1.equals(str)){
    System.out.println(n + " is a palindrome");
    }
 }
}
*/