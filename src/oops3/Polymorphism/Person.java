package src.oops3.Polymorphism;

public class Person {
    //Method overloading->same name;diff args
    void speak(String a){
        System.out.println("A is a string  "+a);

    }
    void speak(int x){
        System.out.println("X is an int " +x);
    }


    public static void main(String[] args) {
    new Person().speak(1);
    new Person().speak("Sneha ");
    }
}

