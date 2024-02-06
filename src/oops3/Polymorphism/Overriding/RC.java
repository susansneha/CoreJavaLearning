package src.oops3.Polymorphism.Overriding;

public class RC {
    public static void main(String[] args) {
Dog d=new Dog();
d.bark();
Hound h= new Hound();
h.bark();

Dog f= new Hound();//dynamic dispatch or runtime polymorphism
f.bark();
    }
}
