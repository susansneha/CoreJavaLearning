package src.oops2;

public class ATBPerson {
    String name;
    long phone;
    String email;
    String coursname;
    boolean ismarried;

   //Default constr
    public ATBPerson() {
        coursname="ATB5x";
        System.out.println("I am Default constr");
    }
    //Parameter constr
    public ATBPerson(String name) {
        this.name = name;
        System.out.println("Parameter constr");
    }



    void talk(){
        System.out.println("Can TAlk");
    }
    void printdetails(){
        System.out.println(name);
        System.out.println(coursname);

    }

}
