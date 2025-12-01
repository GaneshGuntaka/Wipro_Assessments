# Wipro Assessments
**This repository contains my daily Wipro Java assessment programs.**
```
🌟 **Day-1**
🧮 **Arithmetic Operators in Java
Question-1:**
Write a program that takes two numbers as input from the user and performs arithmetic operations on them using arithmetic operators (sum, difference, product, quotient, remainder).

**Example**
int num1 = 10; 
int num2 = 5; 
int sum = num1 + num2; 
System.out.println(sum); // Output: 15  

**Sample Input**
Enter the first number: 10
Enter the second number: 5

**Sample Output**
Sum: 15
Difference: 5
Product: 50
Quotient: 2
Remainder: 0

**Hints**
Use the Scanner class for user input.
Declare variables to store inputs and results.
Use arithmetic operators for calculations.
Handle division by zero.

⚙️ **Logical Operators in Java**
**Question-2:**
Write a program that takes two boolean values as input and performs logical operations (AND, OR).

**Example**
boolean a = true; 
boolean b = false; 
boolean result = a && b; 
System.out.println(result); // Output: false

**Sample Input**
true
false

**Sample Output**
false
true

🔍 **Relational Operators in Java**
**Question-3:**
Compare two integers using relational operators and print true if the first is greater than the second.

**Sample Input**
5
3

**Sample Output**
true

⚖️ **Check Number Parity**
**Question-4:**
Write a Java program to check whether the given number is even or odd using an if-else statement.

**Sample Test Case 1**
Input: 12
Output: No is Even

**Sample Test Case 2**
Input: 13
Output: No is Odd
```
```
🌟 **Day-2**
🔢 **Sum of Array Elements**
**Question-1:**
Write a program to find the sum of elements inside an array.

**Sample Input**
5
1 2 3 4 5

**Output**
The sum of the elements in the array = 15

🧩 **Multidimensional Arrays in Java
Question-2:**
Write a program that takes rows and columns as input to populate and print a 2D array.

**Sample Input**
2
3
1 2 3
4 5 6

**Sample Output**
1 2 3
4 5 6

🔁 **Reverse Each Word in a String
Question-3:**
Reverse each word in a given string.

**Example**
Input: great learning
Output: taerg gninrael

Input: hello guys how are you
Output: olleh syug woh era uoy

🔡 **Equal Character in String
Question-4:**
Find the minimum moves to make all characters in a string the same.

**Input**
aabbbcccc

**Output**
5

**Explanation**
Convert all characters to 'c' (maximum frequency).
```
```
🌟 **Day-3**
👤 **Classes & Objects in Java
Question-1:**
Create a Person class with name and age, take input, and display details.

**Sample Input**
John
25

**Sample Output**
Name: John
Age: 25

🔢 **Sum of All Numbers (Recursion)
Question-2:**
Find the sum of digits using recursion.

**Input**
4246

**Output**
16

📚 **Book Class
Question-3:**
Create a Book class with constructors and a displayInfo() method.

**Sample Output**
Book 1:
Title: Not specified
Author: Unknown
Year: 0

Book 2:
Title: "Java Programming"
Author: "Sakshi"
Year: 2024

📦 **Constructor Overloading
Question-4:**
Calculate cube volume using default and parameterized constructors.

**Sample Output**
Constructor without parameter
Volume is 1000.0
Constructor with parameter
Volume is 192.0
```
```
🌟 **Day-4
🔲 OOPs Rectangle
Question-1:**
Create a Rectangle class with methods to calculate area and perimeter.

🚗 **SuperClass Example
Question-2:**
Implement a superclass Vehicle and subclasses Scooter and Car.

**Output Example**
No of wheels undefined
No of wheels 2
No of wheels 4

🚴 **Bicycle and Mountain Bike
Question-3:**
Implement two classes (Bicycle, MountainBike) based on the given class diagram.

📦 **Volume (Constructor Overloading)
Question-4:**
Create class ThreeDimensionShape with overloaded constructors to calculate volume for cubes and cuboids.
```
```
🌟 **Day-5
⚠️ Exception Handling in Java
Question-1:**
Perform division with exception handling (InputMismatchException, ArithmeticException).

**Sample Run**
Enter the first number: 10
Enter the second number: 0
Cannot divide by zero. Please enter a valid divisor.
Enter the second number: 2
Result: 5

🧾 **Multiple Catch Blocks
Question-2:**
Catch Arithmetic or NumberFormat exceptions while checking factors of 99.

**Sample Input**
5

**Output**
5 is not a factor of 99

**Input**
hi

**Output**
Number Format Exception java.lang.NumberFormatException: For input string: "hi"

🔡 **Exception Handling (Vowels Check)
Question-3:**
Throw an exception if a string doesn’t contain vowels.

**Sample Output**
Original string: Typy gyps fly.
String does not contain any vowels.

📊 **Generic Data Analysis using Java
Question-4:**
Implement a generic class DataAnalyzer with methods for:

Calculating average
Finding maximum
Displaying data summary

**Sample Input**
2
4
45.9
46.8
57.3
37.8

**Sample Output**
Data Summary:
Average: 46.95
Maximum: 57.3
```
```
🌟 **Day-6**
**Question 1
Sort the Collection**
Students are provided with a challenge to sort the given arraylist in the lesser lines of code. Student with minimum lines will win , try to write a code for it in less lines and win

**Input**
An arraylist of integers

**Output**
Sorted list

**Sample input**
1
4
5
0

**output**
List before sort: [1, 4, 5, 0]
List after sort: [0, 1, 4, 5]


**Question 2
generics**
Design a generic class Test to make the main work for Number classes, do not alter main class

**input :**
1 

**output**
"the sum is = 50.0


**Question 3
Library Management System**

**Description :**
You are tasked with building an enhanced Library Management System in Java. The system manages different types of items in the library, such as books, DVDs, and magazines.  Each item has common attributes like title, author/creator, a unique identifier, and a status indicating whether it is checked out or available.

Boiler plate code implementation of base class : LibraryItem and its subclasses : Book ,DVD and Magazine, and a generic class Library representing the library are given. 

The enhanced system introduces the ability to check out and return items. Exceptions are used to handle scenarios where an item is already checked out or not checked out when attempting to return it.

The code starts with the main class EnhancedLibraryManagementSystemwhich contains the main method to execute the Library Management System. 

A description of each class is provided below, along with the task that you need to complete and finish.

**Classes and Methods:
a) LibraryItem Class:
Attributes:**

itemId (unique identifier)
title
creator (author for books, director for DVDs, etc.)
checkedOut (status indicating whether the item is checked out.)
Methods: () 
toString(): Generates a string representation of the item.

**Your Tasks:**
Constructor Implementation: (Complete the code)
Implement the constructor for LibraryItem to initialize its attributes.
Getter Methods: (Complete the code)
Define getter methods for itemId, title, and creator. which will return itemId, title and creator.
Methods:(To be implemented)
checkOut(): Marks the item as checked out.
returnItem(): Marks the item as returned.

***b) Book Class (extends LibraryItem):
Additional Attributes:**

numPages (number of pages) 
Constructor:
public Book(int itemId, String title, String author, int numPages);
Methods:
Inherited methods from LibraryItem. 

**Your Task:**
Constructor Implementation: (Complete the code)
Implement the Constructor : define a parameterized constructor with 4 arguments: int itemId, String title, String author, int numPages.
Hint: Utilize the parent class's (LibraryItem) constructor.
Implement getter method

**c) DVD Class (extends LibraryItem):
Additional Attributes:**
duration (duration in minutes)
Constructor:
public DVD(int itemId, String title, String director, int duration);
Methods:
Inherited methods from LibraryItem.

**Tasks:**
Constructor Implementation: (Complete the code)
Implement the constructor. : define a parameterized constructor with 4 arguments int itemId, String title, String director, int duration.
Hint: Utilize the parent class's (LibraryItem) constructor.
Implement getter method.

**d) Magazine Class (extends LibraryItem):
Additional Attributes:**
issueNumber (magazine issue number)
Constructor:
public Magazine(int itemId, String title, String publisher, int issueNumber);
Methods:
Inherited methods from LibraryItem.

**Tasks:**
Constructor Implementation: (Complete the code) 
Implement the constructor. : define a parameterized constructor with 4 arguments: int itemId, String title, String publisher,   int issueNumber.
Hint: Utilize the parent class's (LibraryItem) constructor.
Implement getter method.

**e) Library Class:
Attributes:**
items (a list of library items)
Methods:
addItem(T item): Adds an item to the library. (Pre-Implemented)
displayItems(): Displays details of all items in the library. (Pre-Implemented)
checkOutItem(int itemId): Checks out an item by marking it as checked out.
returnItem(int itemId): Returns a checked-out item by marking it as returned.
private T findItem(int itemId): Finds an item in the library by its itemId.

**Tasks:**
Implement the methods: (Complete the code)
public boolean checkOutItem(int itemId): Find the item if exist then , Checks out an item and returns true if successful, false otherwise.
public boolean returnItem(int itemId): Find the item if exist then, Returns a checked-out item and returns true if successful, false otherwise.
private T findItem(int itemId): Finds and returns an item by its itemId. Returns null if not found.

**Tasks:**
Custom Exceptions:( Implement)
ItemAlreadyCheckedOutException Class (extends RuntimeException):
Custom exception for handling cases where an item is already checked out. (It should display in the below given format)
format:  Item 101 is already checked out   
Note* ( 101 is itemId)
ItemNotCheckedOutException Class (extends RuntimeException):
Custom exception for handling cases where an item is not checked out when attempting to return it.(It should display in the below given format)
format:  Item 101 is not checked out 
Note* ( 101 is itemId)


**Question 4
Hashmap**

Write a java program to remove an element from the Map, you can use the remove() method. This method takes the key value and
removes the mapping for a key from this map if it is present in the map.
Instruction- before running the program , give 4 string inputs and then the one  integer number which key you want to remove.
keys should start from 1.

**Output-**
Mappings of HashMap are : {1=sakshi, 2=kiran, 3=prashant, 4=kevon}

**Question 5**
**Target Sum**
Rohan is given a task two return indices of pair whose sum will be equal to the given target.
Only one such pair is required.

**Input Format**
size of the array
array elements
target

**Output Format**
index pair whose sum is equal to the target

**Input** 
4
2 7 11 15
9

**Output**
(0 , 1)

**Explanation**
Because nums[0] + nums[1] = 2 + 7 = 9


Mappings after removal are : {1=sakshi, 2=kiran, 3=prashant}
```
```
**Day-7**
**Question-1**
**Employee class**
Create class Employee with attributes id, name, salary and department. Create a collection of few Employee objects. 
Find the average of salaries of employees who belong to the “development” department.
```
```
**Day-8**
**Question-1**

You are required to build a calculator using concept of multithreading which performs the following arithematic operations:
Sum, difference, product, ratio, power.

Input Format - two line separated integers

Output Format
See in sample output

**Input**
6
8

**Output** 
ARITHEMATIC OPERATIONS
SUM 14
DIFFERENCE -2
PRODUCT 48
RATIO O
POWER 1679616.0
END OF A
```
```
**Day 9**

**Question-1**
MYSQL : Scheduling Errors
Write a query which displays the year in ascending order ,find for each semester how many professors are involved in delivering the session for the courses 1 to 10.

The output should contain the columns : year|semester|no_of_professor
no_of_professor: Total number of professor

OUTPUT:


**Question-2**
**Product details**

The e-commerce offering online services to their clients. They are managing the product's sale and purchase through this website. They wants find the products with different categories like furniture,laptop and mobile
Instructions- Display the products fall under the category furniture,laptop, mobile (Use membership operator ‘in’ ) and prices less than 50000.

**Question-3**
**Employeement Salary Analysis**

A multinational company is conducting an analysis of employee performance to identify top-performing individuals within each department. Your task is to retrieve the names of employees who earn a higher salary than the average salary in their respective departments. Write an SQL query to extract the names of employees who earn a salary higher than the average salary in their respective departments. The result should include the first name, last name, department name, and salary of these top-performing employees in ascending order according to the salary.

**Dataset: Consider two tables: "Employees" and "Departments."
Table Structure**

**Employees**
Column Name	  Data Type	                Description
EmployeeID	  INT	Unique           identifier for each employee
FirstName	    VARCHAR(50)	         Employee's first name
LastName	    VARCHAR(50)	         Employee's last name
DepartmentID	   INT	             Reference to the department the employee belongs to
Salary	         INT	             Employee's salary

**Departments**
Column Name	       Data Type	             Description
DepartmentID	        INT	          Unique identifier for each department
DepartmentName	   VARCHAR(50)	    Name of the department

**Sample Table Data**

**Employees**
EmployeeID	   FirstName	    LastName	   DepartmentID	     Salary
1	              John	            Doe	         101	           68000
2             	Jane	           Smith	       102	           60000
3	              Bob	            Johnson	       101	           55000
4             	Alice	            Brown	       103	           70000

**Departments**
DepartmentID	   DepartmentName
101	                  HR
102	                  IT
103	               Marketing

**Sample Output:**

FirstName	      LastName	     DepartmentName	     Salary
John	            Doe	             HR	             68000

```


