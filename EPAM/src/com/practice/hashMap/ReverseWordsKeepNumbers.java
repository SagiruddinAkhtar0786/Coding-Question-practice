package com.practice.hashMap;

public class ReverseWordsKeepNumbers {

    public static void main(String[] args) {
        String input = "123epam456ramu";
        String output = reverseWordsPreserveNumbers(input);
        System.out.println("Output: " + output); // Expected: 123mape456umar
    }

    public static String reverseWordsPreserveNumbers(String input) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean isDigit = Character.isDigit(input.charAt(0));

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch) == isDigit) {
                temp.append(ch);
            } else {
                if (!isDigit) {
                    result.append(temp.reverse()); // reverse letters
                } else {
                    result.append(temp); // keep numbers as is
                }
                temp.setLength(0);
                temp.append(ch);
                isDigit = !isDigit;
            }
        }

        // Append the last part
        if (!isDigit) {
            result.append(temp.reverse());
        } else {
            result.append(temp);
        }

        return result.toString();
    }
}
