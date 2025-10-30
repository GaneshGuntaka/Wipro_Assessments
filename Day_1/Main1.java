// Check Number Parity
// Write a program in java to check whether the given number is an even number or not using if else statement.

// Sample Test Case 1

// input
// 12

// output
// No is Even
// Sample Test Case 2

// input
// 13

// output
// No is odd

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);        
        double num = sc.nextDouble();
        if(num%2==0) {
            System.out.println("No is Even");
        }else{
            System.out.println("No is odd");
        }
    }
}