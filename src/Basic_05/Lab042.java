package src.Basic_05;

import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {
        Scanner uinput= new Scanner(System.in);
        System.out.println("Enter ur name");
        String name= uinput.next();
        System.out.println("Enter ur age");
        int age= uinput.nextInt();
        System.out.println("Enter ur Salary");
        double salary= uinput.nextDouble();
        System.out.println("Your details are" + name + age);
        System.out.println("Your salary is " + salary);
        uinput.close();

    }
}
