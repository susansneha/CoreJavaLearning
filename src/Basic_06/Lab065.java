package src.Basic_06;

import java.util.Scanner;

public class Lab065 {
    public static void main(String[] args) {
        // Take input user Marks of 5 subjects and Print the marks
        Scanner sc=new Scanner(System.in);
        float[] marks= new float[5];
        System.out.println("Enter mark of first subject");
        marks[0]=sc.nextFloat();
        System.out.println("Enter mark of 2nd subject");
        marks[1]=sc.nextFloat();
        System.out.println("Enter mark of 3rd subject");
        marks[2]=sc.nextFloat();
        System.out.println("Enter mark of 4th subject");
        marks[3]=sc.nextFloat();
        System.out.println("Enter mark of 5th subject");
        marks[4]=sc.nextFloat();
        for(int i=0;i<marks.length;i++){
            System.out.println("Marks"+ i+ "-->"+marks[i]);
            if(marks[i]<40){
                System.out.println("You are failed in Marks"+i);
            }
            sc.close();
        }


    }
}
