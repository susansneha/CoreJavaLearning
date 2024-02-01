package src.Basic_06;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
             array[i]=sc.nextInt();
        }
        System.out.println("Output");
        for(int j=0;j<size;j++){
            System.out.println(array[j]);
        }
        sc.close();
    }
}
