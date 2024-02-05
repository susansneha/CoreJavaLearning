package src.oops3;

public class Blockclass {

    {//Instance initializing block->IBB
        System.out.println("I am IIB");
    }
    //Static Block
    static{
        System.out.println("I am SIB");
    }

    public Blockclass() {
        System.out.println("I am DC");
    }
}
