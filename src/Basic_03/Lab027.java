package src.Basic_03;

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number" );
        int a= sc.nextInt();

        if(a%2==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
