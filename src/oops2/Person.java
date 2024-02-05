package src.oops2;

public class Person {
    String name;
    Person(){
        System.out.println("Default constr");
    }
    Person(String refname){
        this.name=refname;
        System.out.println("Para constr");
    }
    void printdetails(){
        System.out.println("Your name is "+this.name);
    }
}
