package src.Basic_05;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X");
        double x = sc.nextDouble();
        System.out.println("Enter the Y");
        double y = sc.nextDouble();
        System.out.println("Enter the Z");
        double z = sc.nextDouble();
        double result;
        result= Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);
        sc.close();

    }
}
