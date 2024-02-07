package src.oops4.Exception.Throw;

public class Lab093 {
    public static void main(String[] args) {
        extracted(0);
    }

    private static void extracted(int b) {
        int a;
       if(b==0){
           throw new ArithmeticException("b cant be zero");
       }else {
           a=10/b;
       }
        System.out.println(a);
    }

}
