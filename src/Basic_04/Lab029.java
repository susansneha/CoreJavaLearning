package src.Basic_04;

import java.util.Scanner;

public class Lab029 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Student Score");
        int score=sc.nextInt();
        if(score>=90&&score<=100){
            System.out.println("Your Score is -> A");
        } else if (score>=80&&score<=89) {
            System.out.println("Your Score is B");
            } else if (score>=70&&score<=69) {
            System.out.println("Your Score is C");

        } else if (score>=60&&score<=69) {
            System.out.println("Your Score is D");
        }else
            System.out.println("You are Failed");
    }
}
