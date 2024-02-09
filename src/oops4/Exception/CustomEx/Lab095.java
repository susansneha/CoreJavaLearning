package src.oops4.Exception.CustomEx;

public class Lab095 {
    public static void main(String[] args) throws Customexception {
        Bank jp=new Bank("USD",100);
        Bank icici=new Bank("INR",200);
        Bank hdfc= new Bank("INR",300);

        Integer Sum= hdfc.add(icici);
        Integer Sum2= hdfc.add(jp);
        System.out.println(Sum);
        System.out.println(Sum2);
    }
}
