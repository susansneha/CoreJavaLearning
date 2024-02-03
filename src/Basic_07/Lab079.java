package src.Basic_07;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        //Palindrome without .reverse
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String, I will check for Palindrome");
        String user_input = scanner.next();
        boolean result = ispalindrome(user_input);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }

    private static boolean ispalindrome(String userInput) {
        String org = userInput;
        String y = "";

        for (int i = userInput.length() - 1; i >= 0; i--) {
            y = y + userInput.charAt(i);
        }
        boolean b=userInput.equalsIgnoreCase(y);
        return b;
    }
}
