package src.Basic_05;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {
        // Sum of Digit = 5+4+3+2+1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        long f=0;
        for(int i=1;i<=number;i++){
            f=f+i;
        }
        System.out.println("Sum-->"+f);
        sc.close();
    }
}
