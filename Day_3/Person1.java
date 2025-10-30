// Classes & Objects in Java

// Instructions:
// Write a program that takes input from the user and creates an object of a class named 'Person'. The 'Person' class should have two member variables: 'name' and 'age'. The program should prompt the user to enter their name and age, create a 'Person' object with the entered values, and then display the name and age of the person.

// Sample Input:
// John
// 25

// Sample Output:
// Name: John
// Age: 25

// Hints:
// 1. Use the 'Scanner' class to read input from the user.
// 2. Create a class named 'Person' with two member variables: 'name' and 'age'.
// 3. Use the 'new' keyword to create an object of the 'Person' class.
// 4. Use the dot operator to access the member variables of the 'Person' object.
// 5. Print the name and age of the person using the 'System.out.println()' method.


import java.util.Scanner;
public class Person1 {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person(sc.nextLine(), sc.nextInt());
        p.displayDetails();
    }
}
