package src.oops4.Exception.CustomEx;

public class Customexception extends Exception{

       public Customexception(String msg){
            super(msg);
            System.out.println("This is Custom Exception ");
        }
}
