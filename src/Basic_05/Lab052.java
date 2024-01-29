package src.Basic_05;

public class Lab052 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Val Even of ->" + i);
                continue;
            }
            System.out.println("Val Odd of -> " + i);

        }
    }
}
