package src.Basic_06;

import java.util.Scanner;

public class Lab072 {
//Swap 2 nos
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a=sc.nextInt();
    System.out.println("Enter the value of b");
    Scanner sc2=new Scanner(System.in);
    int b=sc.nextInt();
    int temp=a;
    a=b;
    b=temp;
    System.out.println("a="+a);
    System.out.println("b="+b);


}
}
