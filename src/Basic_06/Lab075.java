package src.Basic_06;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
//prime numbers
        int i = 0;
        int flag = 0;
        int m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
 m=n/2;
        if (n == 0 || n == 1) {
            System.out.println("Not a prime no");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Not a Prime no");
                    flag = 1;
                    break;
                }
            }
        }
            if (flag == 0) {
                System.out.println("Prime no"+n);
            }
        }
    }



