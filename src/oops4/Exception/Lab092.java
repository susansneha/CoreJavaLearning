package src.oops4.Exception;

public class Lab092 {
    public static void main(String[] args) {

       try {
           String name = null;
           name.trim();
           System.out.println("I am Sneha");
       }catch(Exception e){
           System.out.println("Null!Not possible");
       }
       finally {
           System.out.println("I will be executed any how");
           System.out.println("The end");
       }
    }
}
