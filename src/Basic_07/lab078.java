package src.Basic_07;

import java.util.Scanner;

public class lab078 {
    //palindrome
    public static void main(String[] args) {
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
    static boolean ispalindrome(String userinput) {
        String org = userinput;
        StringBuilder sb = new StringBuilder(userinput);
        String rev = sb.reverse().toString();
        Boolean b = org.equalsIgnoreCase(rev);
        return b;
    }
    }
