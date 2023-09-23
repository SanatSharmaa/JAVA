/*
//WAP TO CHECK IF A NUMBER IS EVEN OR NOT
import java.util.function.Predicate;
import java.util.Scanner;
public class FunctionalInterface{
    public static void main(String args[]){

        Predicate <Integer> isEven = num -> {
            return(num%2==0);
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print(n + " is even : " + isEven.test(n));
   }
}*/
/* 
//WAP TO CHECK IF A CHARACTER IS VOWEL OR NOT
public class Arrays {
    public static void main(String[] args) {
        // Define a functional interface to check if a character is a vowel
        Predicate<Character> isVowel = ch -> {
            char lowerCh = Character.toLowerCase(ch);
            return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
        };

        // Test the functional interface with some characters
        char char1 = 'A';
        char char2 = 'b';
        char char3 = 'E';

        System.out.println(char1 + " is a vowel: " + isVowel.test(char1));
        System.out.println(char2 + " is a vowel: " + isVowel.test(char2));
        System.out.println(char3 + " is a vowel: " + isVowel.test(char3));
    }
}
*/
