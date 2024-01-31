package src.Basic_05;

import java.util.Scanner;

public class Lab056 {
    //Factorial using while and for
    public static void main(String[] args) {
        System.out.println("Enter the number");
    Scanner sc= new Scanner(System.in);
    int number=sc.nextInt();
    long f=1;
//    int i=1;
//    while(i<=number){
//        f=f*i;
//        i++;
//    }
        //System.out.println("factorial-->"+f);
        for (int j = 1; j <= number ; j++) {
            f = f*j;
        }

        System.out.println("Fact -> "+ f);


        sc.close();


    }}
