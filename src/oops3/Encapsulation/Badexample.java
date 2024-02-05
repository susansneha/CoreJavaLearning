package src.oops3.Encapsulation;

public class Badexample {

    public static void main(String[] args) {
        vwologin v = new vwologin("admin", "admin");
        boolean b = v.isloggedIn("admin", "password");
       // v.password = "password";
        v.setUsername("admin");
        System.out.println(v.getPassword());
       // boolean b2 = v.isloggedIn("admin", "password");
      //  System.out.println(b2);
    }
}
      class vwologin{
          public String getUsername() {
              return username;
          }

          public void setUsername(String username) {
              this.username = username;
          }
          private String username;

          public String getPassword() {
              return password;
          }

          private String password;
        public vwologin(String username, String password) {
            this.username = username;
            this.password = password;
        }

        boolean isloggedIn(String username,String password){
            if(this.username.toLowerCase().equals(username)&& this.password.toLowerCase().equals(password)){
                return true;
            }
            else{
                System.out.println("Wrong");
                return false;
            }
        }




    }

