package src.oops2.Inheritance.Hierarchical;

public class Vehicle {
    Vehicle(){
        System.out.println("DC Vehicle");
    }
    void vhastopspeed(){
        System.out.println("Yeah from"+getClass().getSimpleName());
    }
}
