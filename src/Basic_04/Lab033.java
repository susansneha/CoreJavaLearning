package src.Basic_04;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab033 {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
        System.out.println("Enter browser name");
    String br= sc.nextLine();
    switch(br.toLowerCase()){
        case "chrome":
            System.out.println("Execute the chrome code");
        break;
        case "firefox":
            System.out.println("Execute the Firefox Code");
            break;
        case "edge":
            System.out.println("Execute the Edge Code");
            break;
        default:
            System.out.println("I have not idea which browser is this");
    }
}
}
