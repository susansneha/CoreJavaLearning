package src.oops4.Exception.CustomEx;

public class Bank {
    String currency;
    Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public String getCurrency() {
        return currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer add(Bank bankname) throws Customexception{
        if(!(bankname.currency.equalsIgnoreCase("INR"))){
            throw new Customexception("Currency not matching");
        }

        Integer sum= this.amount+bankname.amount;
        return sum;
    }

}
