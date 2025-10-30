// Reverse each word in a string
// Write a function to reverse each word in a string.

// Description :- A method has to be created that takes a string as input and extracts each word from 
// that string and then reverse each word individually and gives the output as a reversed string. 

// Example :-

// Input:- great learning
// output :- taerg gninrael

// input :- hello guys how are you
// output :- olleh syug woh era uoy


// Explanations :- As the input string is great learning, each word has to be extracted i.e. great and 
// learning then individually each word has to be reversed so it will be taerg and gninrael. after combining these two words into as single string the final output will be taerg gninrael.


import java.util.Scanner;
public class ReverseWords {
    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = args[0];
        String result = reverseEachWord(input);
        System.out.println(result);
    }
}