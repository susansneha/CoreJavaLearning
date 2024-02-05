package src.oops2;

public class BankAccount {
    String bankname;
    int bal;
    String bankcode;

    //Default constr
    public BankAccount() {
        bankname="SBI";
        bal=100;
        bankcode="SBI001";
    }
    //Parameter constr
    BankAccount(String bname,int balance,String bcode){
        this.bankname=bname;
        this.bal=balance;
        this.bankcode=bcode;

    }


    void printdetails(){
        System.out.println(bankname);
        System.out.println(bal);
        System.out.println(this.bankcode);
    }
}
