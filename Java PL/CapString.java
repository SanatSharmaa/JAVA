/* 
import java.util.*;

public class CapString{

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
        StringBuilder str2 = new StringBuilder();
        int len = str.length();

        boolean capitalizeNext = true; // Flag

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                str2.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                str2.append(ch);
            }
        }

         System.out.println(str2);//.toString().trim());
    }
}*/
