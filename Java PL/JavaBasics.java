
// //Calculate min number of operations to peform on a given no. to reduce it to 0/1
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int count = 0;
   
//         while(n>1){
//             if (n%2==0){
//                 int num = n/2;
//                 n = num;
//                 count++;
//             }
//             else{
//                 n = n-1;
//                 count++;
//             }
//         }
//         System.out.println(count);
//         System.out.println(n);
//     }
// }



/*import java.util.Scanner;

public class JavaBasics {
    
    static class MathUtil {
        int num1;
        int num2;
        String operator;

        MathUtil(int a, int b, String opr) {
            this.num1 = a;
            this.num2 = b;
            this.operator = opr;
        }

        void add() {
            System.out.println("Addition : " + (num1 + num2));
        }
        void sub() {
            System.out.println("Subtraction : " + (num1 - num2));
        }
        void mul() {
            System.out.println("Multiplication : " + (num1 * num2));
        }
        void div() {
            System.out.println("Division : " + (num1 / num2));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator : ");
        String operator = sc.next();

        MathUtil mathUtil = new MathUtil(num1, num2, operator);

        if (operator.equals("+")) {
            mathUtil.add();
        } else if (operator.equals("-")) {
            mathUtil.sub();
        } else if (operator.equals("*")) {
            mathUtil.mul();
        } else if (operator.equals("/")) {
            mathUtil.div();
        } else {
            System.out.println("Invalid operator.");
        }
        
        sc.close(); // Close the scanner to avoid resource leaks
    }
}
*/




//INNER CLASSES
/* 
class JavaBasics{
    String name ;
    int n ;
    JavaBasics(String str , int a ){
        name = str;
        n = a;

    }
    class Class2{
        void display(){
            System.out.println(name);
            System.out.println(n);
        }
    }
    public static void main(String args[]){
        JavaBasics obj1 = new JavaBasics("Java",18);
        JavaBasics obj2 = new JavaBasics("Python",19);
        JavaBasics.Class2 obj3 = obj2.new Class2();
        obj3.display();
    }
}*/

/*

//ABSTRACT CLASS 

abstract class CoffeeMachine {
    protected int waterCapacity;
    protected int currentWaterLevel;

    public CoffeeMachine(int waterCapacity) {
        this.waterCapacity = waterCapacity;
        this.currentWaterLevel = 0;
    }

    public abstract void brewCoffee();

    public void addWater(int amount) {
        if (amount > 0 && amount <= waterCapacity) {
            currentWaterLevel += amount;
            System.out.println("Added " + amount + " ml of water. Current water level: " + currentWaterLevel + " ml");
        } else {
            System.out.println("Invalid amount of water!");
        }
    }
}

class BasicCoffeeMachine extends CoffeeMachine {
    private int coffeePowder;

    public BasicCoffeeMachine(int waterCapacity, int coffeePowder) {
        super(waterCapacity);
        this.coffeePowder = coffeePowder;
    }

    @Override
    public void brewCoffee() {
        if (currentWaterLevel >= 150 && coffeePowder >= 10) {
            currentWaterLevel -= 150;
            coffeePowder -= 10;
            System.out.println("Coffee is brewing...");
            System.out.println("Your coffee is ready!");
        } else {
            System.out.println("Not enough water or coffee powder to brew coffee. Please check the water and coffee levels.");
        }
    }
}

public class JavaBasics {
    public static void main(String[] args) {
        BasicCoffeeMachine basicMachine = new BasicCoffeeMachine(500, 50);
        basicMachine.addWater(300);  // Add 300 ml of water
        basicMachine.brewCoffee();   // Brew coffee

        // Add more water and brew again
        basicMachine.addWater(200);  // Add 200 ml of water
        basicMachine.brewCoffee();   // Brew coffee

        // Attempt to brew with insufficient resources
        basicMachine.brewCoffee();   // Not enough water or coffee powder
    }
}



/* 
//WAP to find the symmeteric digits between a given range

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter low limit: ");
        int low = sc.nextInt();
        System.out.print("Enter high limit: ");
        int high = sc.nextInt();

        for (int i = low; i <= high; i++) {
            int originalNumber = i;
            int sum1 = 0;
            int sum2 = 0;
            String str = Integer.toString(i);
            int len = str.length();
            if (len==1){
                continue;
            }
            if (len %2!=0){
                System.out.println("Enter even limits");
                break;
            }
            else if (len % 2 == 0) {
                int c = len / 2;
                int temp = i;
                for (int j = 0; j < c; j++) {
                    sum1 += temp % 10;
                    temp /= 10;
                }
                for (int k = 0; k < c; k++) {
                    sum2 += temp % 10;
                    temp /= 10;
                }
            }
            if (sum1 == sum2) {
                System.out.println(originalNumber);
            }
        }
    }
}*/



//WAP to CONVERT a string into "string"
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        str = str.trim();
        str = ' ' + str + ' ';
        String str1 = "";
        int len = str.length();
        for (int i = 0 ; i<=len ; i++){
            if (i == len-1){
                break;
            }
            char ch = str.charAt(i);
            if (ch == ' '){
                str1 = str.substring(i+1,str.indexOf(' ',i+1));
                System.out.print('"'+str1+'"' + ' ');
            }  
        }
    }
}*/



/* 
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int len = str.length();
        int count = 0;
        for (int i = 0 ; i<len;i++){
            char ch = str.charAt(i);
            //int count = 0;
            if(ch != 'H'){
                count++;
            }else{
                break;
            }
        }System.out.println("I " + "+ " + count);
        
    }
}*/




/*//WAP To find the berth of your seat number 
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your seat number :");
        int n = sc.nextInt();

        int berth = n%8;
        if (berth == 1 || berth == 4){
            System.out.println("Your berth is LOWER.");
        }
        else if(berth == 2 || berth == 5){
            System.out.println("Your berth is MIDDLE.");
        }
        else if(berth == 3 || berth == 6){
            System.out.println("Your berth is UPPER.");
        }
        else if (berth == 7){
            System.out.println("Your berth is SIDE LOWER.");
        }else{
            System.out.println("Your berth is SIDE UPPER.");
        }
    }
}*/


/*//WAP to perform various CONVERSIONS
import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 or 2 : ");
        int n = sc.nextInt();

        if (n == 1){
            String bin = "";
            System.out.print("Enter a decimal number : ");
            int dec = sc.nextInt();
            int quo = 0;
            int rem = 0;
            while (dec>0){
                rem = dec%2;
                quo = dec/2;
                String str = Integer.toString(rem);
                bin = str + bin;
                dec = quo ;
            }
            System.out.println("Binary number : " + bin);
        }
        if (n==2){
            System.out.print("Enter a binary number : ");
            int bin = sc.nextInt();

            int sum = 0;
            int c = 0;
            while(bin>0){
                int last_dig = bin%10;
                sum += last_dig * ((int)Math.pow(2,c));
                bin = bin/10;
                c++;
            }
            System.out.println(sum);

        }
    }
}/* */





/*
//WAP to find the good number .
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int orig = n;

        int last_dig = 0;
        int prevSum = 0;

        while (n > 0) {
            last_dig = n % 10;
            int currentSum = last_dig + prevSum;

            if (last_dig >= prevSum) {
                prevSum = currentSum;
                n /= 10;
            } else {
                System.out.println(orig + " is not a good number.");
                return;
            }
        }

        System.out.println(orig + " is a good number.");
    }
}*/

/* //not yet done
import java.util.*;
import java.io.*;

class JavaBasics{
    
    public static void queries (int a ,int b , int n){
        int q = a+b;
        System.out.print(q+ " ");
        for (int i = 1 ;i <= n;i++){
            q = ((int)Math.pow(2,i))*b;
            q+=q;
            System.out.print(q + " ");
        }
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            JavaBasics.queries(a, b, n);
        }
        
        
        in.close();
    }
}*/



/* 
//WAP to count the occurence of word in a string
import java.util.Scanner;

public class JavaBasics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        String targetWord = scanner.next();

        // Split the input string into words using whitespace as the delimiter
        String[] words = inputString.split("\\s+");

        // Initialize a count to keep track of the word's occurrences
        int count = 0;

        // Iterate through the words and count occurrences of the target word
        for (String word : words) {
            if (word.equals(targetWord)) {
                count++;
            }
        }

        System.out.println("The word '" + targetWord + "' appears " + count + " times in the string.");

        scanner.close();
    }
}*/



// TO SPLIT A STRING IN DIFERENT WORDS
/*
import java.util.*;
public class JavaBasics {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        str = str.trim();
        str = " " + str + " ";
        for (int i = 0 ; i<str.length()-1;i++){
            char ch = str.charAt(i);
            if (ch == ' '){
                String str1 = str.substring(i+1,str.indexOf(' ',i+1));
                System.out.println(str1);
            }
        }
    }
}
*/


/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of 1st array : ");
        int size1 = sc.nextInt();
        int arr1[] = new int [size1];
        System.out.println("Enter elements of 1st array : ");
        for (int i = 0 ; i< size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of 2nd array : ");
        int size2 = sc.nextInt();
        int arr2[] = new int [size2];
        System.out.println("Enter elements of 2nd array : ");
        for (int i = 0 ; i<size2 ; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("Intersection of two arrays : ");
        for ( int i = 0 ; i < size1;i++){
            for (int j = 0 ; j<size2;j++){
                if (arr1[i]==arr2[j]){
                    System.out.println(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}*/

/*
//WAP to calculate the sum of elements at the boundary of an array.

import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");//2
        int row = sc.nextInt();
        System.out.println("Enter no. of columns : ");//2
        int col = sc.nextInt();
        int arr[][] = new int [row][col];
        System.out.println("Enter elements of array : ");
        for (int i = 0;i<row;i++){

            for (int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    // Check if the current element is on the boundary
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum is : " + sum);
    }
}*/

/* 
//WAP to find an automorphic number
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int c = str.length();
        int sqr = n*n;
        int dig = sqr % (int)(Math.pow(10,c));
        if (n==dig){
            System.out.println("It is an automorphic number.");
        }else{
            System.out.println("It is not an automorphic number.");
        }
    }
}*/


/*import java.util.*;
public class JavaBasics{
    public static void main (String args[]){
        System.out.print("Enter size of array : ");
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter elements of array : ");
        int count = 0;
        for (int i =0 ; i<size;i++){
            arr[i] = sc.nextInt();

            if (arr[i] == i ){
                count ++;
            }
        }
        System.out.println("Number is : " + count);
    }
}*/

/* 

import java.util.Scanner;
class JavaBasics{
    int n ;

    void pattern (int n,int value){
        for (int i = 1 ; i<=n ; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    void pattern (int n,char value){
        for (int i = 1 ; i<=n ; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    void pattern (int n,String value){
        for (int i = 1 ; i<=n ; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        JavaBasics obj = new JavaBasics();
        System.out.print("Enter value to be printed (int): ");
        int intValue = sc.nextInt();
        obj.pattern(n, intValue);

        System.out.print("Enter value to be printed (char): ");
        char charValue = sc.next().charAt(0);
        obj.pattern(n, charValue);

        System.out.print("Enter value to be printed (String): ");
        String stringValue = sc.next();
        obj.pattern(n, stringValue);

        sc.close();
    }
} 
*/

/* 
// WAP to capitalize first letter of each word in a string.
import java.util.*;

public class JavaBasics {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        int len1 = A.length();
        int len2 = B.length();
        int sum = len1 + len2;
        System.out.println(sum);
        
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String str = A + " " + B;
        
        str = str.trim();
        
        str = " " + str + " ";
        String str2 = "";
        int len = str.length();
        
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (i==len-1){
                break;
            }
            if (ch == ' ') {
                int t=str.length();
                int wordStart = i + 1;
                String str1 = str.substring(wordStart, wordStart + 1);
                str1 = str1.toUpperCase();
                int l =str.indexOf(' ',wordStart);   
                str2+=str1+str.substring(wordStart+1,l)+" ";
                str= str.substring(l,t);            
            }
        }
        
        System.out.println(str2);
    }
}*/


// WAP to reverse each word in a given string
/* 
import java.util.*;
public class JavaBasics{

   public String reverse (String str){
    String rev ="" ;
    for (int i = 0 ; i<str.length() ; i++){
        rev = str.charAt(i) + rev;
    }
    return rev;
}

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int words = 0;
        int len = str.length();
        str = str.trim();
        str = str + ' ';
        JavaBasics obj = new JavaBasics();
        String ans = "";
        for (int i = 0 ; i < len;i++){
        
            String word = "" ;
            while (str.charAt(i) != ' '){
                
                word = word + str.charAt(i);
                i ++;

            }

            String s = obj.reverse(word);
            ans = ans + s + " ";
        words ++;
        }
        System.out.println(ans);
        System.out.println("Number of words : " + words);
    }
}*/



//WAP to count the number of words in a sentence
/*
import java.util.*;
public class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int words = 0;
        int len = str.length();
        str = str.trim();
        str = str + ' ';
        for (int i = 0 ; i < len;i++){
            char ch = str.charAt(i);
            
            if (ch == ' '){
                words ++;
            }
        }
        System.out.println("Number of words : " + words);
    }
}*/



/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/


/*
 //Program to print the multiplication table of a number N, entered by the
 user.
 import java.util.*;
 public class JavaBasics{
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter a number : ");
 int n = sc.nextInt();
 
 for (int i = 1; i <=10 ; i++){
 System.out.println(n + " " + i + " = " + n*i);
 }
 }
 }
 */

/*
 //Program to find the factorial of a given number
 
 import java.util.Scanner;
 
 public class JavaBasics {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 System.out.print("Enter a number: ");
 int num = scanner.nextInt();
 
 long factorial = 1;
 
 for (int i = 1; i <= num; i++) {
 factorial *= i;
 }
 
 System.out.println("Factorial of " + num + " is: " + factorial);
 
 scanner.close();
 }
 }
 */

/*
 //Java program that reads a set of integers from the user and then prints the
 sum of the even and odd integers
 import java.util.Scanner;
 
 public class JavaBasics{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 System.out.print("Enter the number of integers: ");
 int n = scanner.nextInt();
 
 int evenSum = 0;
 int oddSum = 0;
 
 System.out.println("Enter " + n + " integers:");
 
 for (int i = 0; i < n; i++) {
 int num = scanner.nextInt();
 if (num % 2 == 0) {
 evenSum += num;
 } else {
 oddSum += num;
 }
 }
 
 System.out.println("Sum of even integers: " + evenSum);
 System.out.println("Sum of odd integers: " + oddSum);
 
 scanner.close();
 }
 }
 */

/*
 //Program to check if a number is prime or not
 
 import java.util.*;
 public class JavaBasics{
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter your number : ");
 
 int n = sc.nextInt();
 boolean isPrime = true;
 for (int i = 2;i <= n-1 ; i ++){// for optimisation use condition ;i<=
 Math.sqrt(n);
 if (n%i == 0){ // n is a multiple of i (i not equal to 1 or n)
 isPrime = false;
 }
 }
 if (isPrime == true){
 System.out.println("prime number.");
 }else{
 System.out.println("not prime number.");
 }
 }
 }
 */

/*
 import java.util.*;
 //Keep printing the number unless it is a multiple of 10
 public class JavaBasics{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
 do{
 System.out.print("Enter your number : ");
 int n = sc.nextInt();
 if (n % 10 == 0){
 continue;
 }
 System.out.println(n);
 
 }while(true);
 }
 }
 */

/*
 import java.util.*;
 public class JavaBasics {
 public static void main (String args[]){
 System.out.print("Enter the n : ");
 Scanner sc = new Scanner (System.in);
 int n = sc.nextInt();
 int rev = 0;
 while( n > 0 ){
 int last_digit = n%10;
 rev = (rev*10) + last_digit;
 n/=10;
 
 }
 System.out.println(rev);
 }
 }
 */

// Program for finding a leap year
/*
 import java.util.*;
 public class JavaBasics{
 public static void main (String args[]){
 Scanner sc = new Scanner (System.in);
 int year = sc.nextInt();
 
 boolean x = (year % 4) == 0;
 boolean y = (year % 100 ) != 0;
 boolean z = ((year % 100 ) == 0 && (year %400)==0);
 
 if (x && (y || z)){
 System.out.println("Leap Year!");
 
 }else{
 System.out.println("Not a leap year !");
 }
 }
 }
 */