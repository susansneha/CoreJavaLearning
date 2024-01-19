package src.Basic_04;

import java.util.Scanner;

public class Lab031 {
    public static void main(String[] args) {


    //Triangle classifier
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 sides");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        if((s1==s2)&&(s1==s3)&&s1==s2){
            System.out.println("Eq");
        }else if ((s1==s2)||(s1==s3)||(s2==s3)){
            System.out.println("Iso");
        }else System.out.println("Scalene");


    }
}
