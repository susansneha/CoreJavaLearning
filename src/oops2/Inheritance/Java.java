package src.oops2.Inheritance;

public class Java extends Programming{
    String newfeature;
    Java(){
        System.out.println("Java DC");
    }
    Java(String feature){
        this.newfeature=feature;
    }
    void printinfo(){
        System.out.println("child info..Feature is->"+this.newfeature);
    }

}
