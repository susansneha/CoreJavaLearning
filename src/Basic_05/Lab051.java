package src.Basic_05;

public class Lab051 {
    public static void main(String[] args) {

        for (
                int i = 0;
                i < 10; i++) { // 10 Times, i -> 0 to 9
            System.out.println(i);
            if (i == 5) continue;
            System.out.println("**AFTER");
        }
    }
}
