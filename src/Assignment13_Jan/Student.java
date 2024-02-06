package src.Assignment13_Jan;

public class Student {
    String name;
    int age;
    long Phno;
    String email;
    public Student() {
    }
    Student(String n,int a,long pm,String em){
        this.name=n;
        this.age=a;
        this.Phno=pm;
        this.email=em;
    }

    void printname(String name){
        System.out.println("name->"+this.name);
    }
    void printage(int a){
        System.out.println("Age->"+this.age);
    }
void printphno_em(long phno,String em){
    System.out.println(this.Phno+""+this.email);
}

}
