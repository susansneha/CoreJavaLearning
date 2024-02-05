package src.oops3.Encapsulation;

public class Lab90 {
    public static void main(String[] args) {
        //hidden code
        vwologinfixed v=new vwologinfixed("admin","admin");
        //hidden code
        boolean b=v.isLoggedIn("admin","password");
        System.out.println(b);
       String u = v.getUsername();
        System.out.println(u);
//        String u = v.getPassword();
//        v.password = "?";

      //  System.out.println(check);
    }
}

class vwologinfixed{
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private  String username;
    private String password;

    vwologinfixed(String username, String password) {
        this.username = username;
        this.password = password;
    }
    boolean isLoggedIn(String username, String password){



        if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged IN!!");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }

    }

}