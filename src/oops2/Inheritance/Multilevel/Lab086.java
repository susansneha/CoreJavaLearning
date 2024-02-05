package src.oops2.Inheritance.Multilevel;

public class Lab086 {
        public static void main(String[] args) {
        Grandfather g=new Grandfather();
        Father f= new Father();
        son s= new son();

        Grandfather g1= new son();
        Father f1=new son();
        //son s1= new Grandfather();
        //son s1=new Father();
        s.bhk1();
        s.bhk2();
        s.bhk3();
        g.bhk3();
        f.bhk2();
        f.bhk3();

    }
}
