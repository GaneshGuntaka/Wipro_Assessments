// Exception Handling
// Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.

// Sample Output:

// Original string: Java handling and managing exceptions
// String contains vowels.

// Original string: Typy gyps fly.
// String does not contain any vowels

import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
		   
			  try {
		      String text = s.nextLine();
          System.out.println("Original string: "+text);
          try{
            checkVowels(text);
            System.out.println("String contains vowels");
          } catch (NoVowelsException e){
            System.out.println(e.getMessage());
          }
        } catch (Exception e){
          System.out.println("An error occured: "+e);
        }
    }
    public static void checkVowels(String text) throws NoVowelsException{
        text = text.toLowerCase();
        if(!(text.contains("a") || text.contains("e")|| text.contains("i")|| text.contains("o")||text.contains("u"))){
          throw new NoVowelsException("String does not contain any vowels");
        }
      }
    }
class NoVowelsException extends Exception{
  public NoVowelsException(String message){
    super(message);
  }
}