package src.oops2;

import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args) {
       // Person p= new Person();
        //new Person();
        //Person p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String name = sc.next();

        Person p2= new Person(name);
        p2.printdetails();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Second Name");
        String name2 = sc.next();

        Person p3= new Person(name2);
        p3.printdetails();
        sc.close();
    }
}
