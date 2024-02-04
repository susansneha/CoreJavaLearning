package src.Basic_07.OOPs;

public class Lab080 {
    public static void main(String[] args) {
        Person p=new Person();
        p.name="Sneha";
        p.age=35;
        p.height=156;
        System.out.println(p.name);
        p.talk();
        p.ismarried();
        System.out.println(p.ismarried());

        Person p2= new Person();
        p2.name="Eldho";
        p2.age=37;
        System.out.println(p2.name);
        p2.talk();
        System.out.println(p2.ismarried());

    }
}
