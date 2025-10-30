// sum of the elements present inside the array
// 1. Write a program to find the sum of the elements present inside the array.

// Sample Input:
// 5
// 1 2 3 4 5
// Output: the sum of the elements in the array = 15
// Sample Input2:
// 3
// 19 45 34
// Output: the sum of the elements in the array = 98


import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int size = input.nextInt();  
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }        
        sumArray(arr,size);
        
    }
    public static void sumArray(int[] arr,int size)
    {
      int sum=0;
      for(int i = 0; i < size; i++){
          sum=sum+arr[i];
      }
      System.out.println("the sum of the elements in the array = "+ sum);
     
    }
}