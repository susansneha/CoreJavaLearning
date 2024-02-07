package src.Assignment13_Jan;

public class ATBClass {
    // Name,age,ph no,roll no,address
    // create array of 10stdnts.add names
    //print the names
    //try inheritance..single multilevel, hierarchical
    //create overloading overriding examples

    public static void main(String[] args) {
        Student[] ATBStudent = new Student[5];
        ATBStudent[0] = new Student("Sneha", 35, 987654321, "ssssss@ssss");
        ATBStudent[1] = new Student("snsn", 36, 876789876, "uuuu@uuuu");
        ATBStudent[2] = new Student("hhhhh", 37, 678765434, "fffff@hhhh");
        ATBStudent[3] = new Student("bbbbb", 38, 876787, "yyyy@yyyy");
        ATBStudent[4] = new Student("xxxxx", 39, 8745587, "xxxx@xxxx");
        //Print details
        for (int i = 0; i < ATBStudent.length; i++) {
            System.out.println(ATBStudent[i].name + " " + ATBStudent[i].age + " " + ATBStudent[i].Phno + " " + ATBStudent[i].email);
        }
// Single Inheritance
        ATB1 s1 = new ATB1();
        s1.print();
        //Multilevel
        ATB1child s2 = new ATB1child();
        s2.print1();
//Hierarchical
        ATB2 s3 = new ATB2();
        s3.print();

        //overloading


    }


    }
