import java.util.*;

public class Calculator {
    void calculate(int num1, int num2, String operator) {
        class Calculator1 {
            void addition() {
                int ans = num1 + num2;
                System.out.println("Addition: " + ans);
            }

            void subtraction() {
                int ans = num1 - num2;
                System.out.println("Subtraction: " + ans);
            }

            void divide() {
                int ans = num1 / num2;
                System.out.println("Division: " + ans);
            }

            void multiply() {
                int ans = num1 * num2;
                System.out.println("Multiplication: " + ans);
            }
        }

        Calculator1 inobj = new Calculator1();
        if (operator.equals("+")) {
            inobj.addition();
        }
        if (operator.equals("-")) {
            inobj.subtraction();
        }
        if (operator.equals("*")) {
            inobj.multiply();
        }
        if (operator.equals("/")) {
            inobj.divide();
        }
    }

    public static void main(String args[]) {
        Calculator outobj = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator : ");
        String operator = sc.next();
        outobj.calculate(num1, num2, operator);
        sc.close(); // Close the scanner to avoid resource leaks
    }
}



/*
public class BankAccount {
    int acc_number ;
    int balance ;
    
    BankAccount(int num , int bal){
        this.acc_number = num;
        this.balance = bal;
    }
    class Transaction {

        void withdraw (){
            if (balance > 0){
                System.out.println("Withdrawn!");
            }
        }

        void deposit(){
            System.out.println("Deposited in account number : " + acc_number);
        }
    }
    public static void main(String args[]){
        BankAccount obj1 = new BankAccount(123,90000);
        BankAccount.Transaction obj2 = obj1.new Transaction();
        obj2.withdraw();
        obj2.deposit();
    }
}
*/
