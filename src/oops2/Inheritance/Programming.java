package src.oops2.Inheritance;

public class Programming {
    int version;
    String author;

    public Programming() {
        System.out.println("Programming DC");
            }

    public Programming(String author,int version) {
        this.author = author;
        this.version=version;
    }
    void printinfo(){
        System.out.println("Author->"+this.author+"Version"+this.version);
    }

}
