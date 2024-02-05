package src.oops2;

public class Lab082 {
    public static void main(String[] args) {
        BankAccount sbi= new BankAccount();
        sbi.printdetails();
        System.out.println("------");
        BankAccount hdfc=new BankAccount("HDFC",999,"HDFC002");
        hdfc.printdetails();
        BankAccount icici=new BankAccount("ICICI",500,"ICICI003");
        icici.printdetails();
    }
}
