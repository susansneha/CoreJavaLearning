package src.oops3.AccessModifiers.police;

public class cop {
    public int  gun;


    public cop(int gun) {
        this.gun = gun;
    }
    protected void canIshoot(){
        System.out.println("I can shoot");
    }
}
