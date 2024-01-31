package src.Basic_06;

public class Lab062 {
    public static void main(String[] args) {
        int[] a1={1,2,3,4};
        int[] a2= {1,2,3,4};
      //  System.out.println(a1==a2);
       // System.out.println(a1.equals(a2));
      //  System.out.println("---");
        int[]a3=a1;
       // System.out.println(a3.length);
        a3[0]=24;
        System.out.println(a1[0]);
        System.out.println(a3[0]);


    }
}
