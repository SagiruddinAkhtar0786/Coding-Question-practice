package com.practice.hashMap;

public class ReverseLetters {
   public static String reverseOnlyLetters(String s) {
       // Step 1: Extract alphabetical characters
       StringBuilder characters = new StringBuilder();
       for (char c : s.toCharArray()) {
           if (Character.isLetter(c)) {
               characters.append(c);  // Collect all letters
           }
       }

       // Step 2: Reverse the characters
       characters.reverse();
System.out.println(characters.toString());
       // Step 3: Reinsert the characters into the original positions
       StringBuilder result = new StringBuilder();
       int charIndex = 0;
       for (char c : s.toCharArray()) {
           if (Character.isLetter(c)) {
               // Place reversed character in the current letter's position
               result.append(characters.charAt(charIndex++));
           } else {
               // Keep the original non-letter character in place
               result.append(c);
           }
       }

       return result.toString();
   }

   public static void main(String[] args) {
       // Test case
       String input = "123epam456ramu";
       String output = reverseOnlyLetters(input);
       System.out.println("Input: " + input);
       System.out.println("Output: " + output);
   }
}

