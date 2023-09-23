//CUSTOM EXCEPTION
class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
    
// class that uses custom exception InvalidAgeException  
public class Exception_Handling  
{  
  
    // method to check the age  
    static void validate (int age) throws InvalidAgeException{    
       if(age < 18){  
  
        // throw an object of user defined exception  
        throw new InvalidAgeException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    // main method  
    public static void main(String args[])  
    {  
        try  
        {  
            // calling the method   
            validate(13);  
        }  
        catch (InvalidAgeException ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  
}  


/*
import java.util.*;
public class Exception_Handling{

    static void checkError(int num){
        if (num>0){
            try {
                throw new ArithmeticException ("Number is positive . ");
            }
            catch(ArithmeticException a){
                System.out.print(a);
            }
        }else{
            System.out.println(num);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits : ");
        int n = sc.nextInt();
        int arr [] = new int [n];
        for (int i = 0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int j = 0 ;j<arr.length;j++){
            Exception_Handling.checkError(arr[j]);
        }
    }
}*/



/*
import java.util.*;
public class Exception_Handling{

    static void checkError(char ch ){
        if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u'){
            throw new ArithmeticException("String does not contains vowels !");

        }else{
            System.out.println(ch);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        for (int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            Exception_Handling.checkError(ch);
        }
    }
}
*/




/*
// EXCEPTION HANDLING USING THROW KEYWORD
import java.util.*;
public class Exception_Handling{
    static void print(char ch){
        if (ch == 'a'|| ch =='e'|| ch=='i'||ch=='o'||ch=='u'){
            throw new ArithmeticException ("string contains vowels ! ");
        }else{
            System.out.println(ch);
        }

        //OR -->
        // if (ch == 'a'|| ch =='e'|| ch=='i'||ch=='o'||ch=='u'){
        //     try{
        //         throw new ArithmeticException ("string contains vowels ! ");
        //     }
        //     catch(ArithmeticException a){
        //         System.out.println(a);
        //     }
        // }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0 ; i<str.length();i++){
            char ch2 =  str.charAt(i);
            //System.out.print(ch2);
            Exception_Handling.print(ch2);
        }
    }
}*/

/*
//ARITHMETIC EXCEPTION HANDLING
import java.util.*;

public class Exception_Handling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int n = sc.nextInt();
        System.out.print("Enter denominator: ");
        int d = sc.nextInt();

        try {
            int ans = n / d;
            System.out.println("Result: " + ans);
        } catch (ArithmeticException p) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println(p);
        }
    }
}*/

