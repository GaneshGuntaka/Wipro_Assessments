// Exception hanlding in java
// Write a Java program that takes two integers as input and performs division. The program should handle exceptions for invalid input (non-integer input) and division by zero. The program should continue to prompt the user for valid input until successful division is performed.

// Requirements:

// Handle InputMismatchException if the user inputs non-integer values.
// Handle ArithmeticException if the user attempts to divide by zero.
// Use a loop to ensure the program continues to prompt the user until valid input is received and the division is successfully performed.

// Sample Input and Output:
// Sample Run 1:
// Enter the first number: 10
// Enter the second number: 2
// Result: 5

// Sample Run 2:
// Enter the first number: 10
// Enter the second number: 0
// Cannot divide by zero. Please enter a valid divisor.
// Enter the second number: 2
// Result: 5

// Sample Run 3:
// Enter the first number: ten
// Invalid input. Please enter an integer.
// Enter the first number: 10
// Enter the second number: 2
// Result: 5


import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 =0;
        while(true){
            try{
                num1 = sc.nextInt();
                break;
            } catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine();
            }
        }
        while(true){
            try{
                num2 = sc.nextInt();
                if(num2==0){
                    System.out.println("Cannot divide by zero. Please enter a valid divisor.");
                    continue;
                }
                int result = num1/num2;
                System.out.println("Result: " +result);
                break;
            } catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine();
            }

        }

        sc.close();
    }
}