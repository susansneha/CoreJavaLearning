package src.Basic_07;

import java.util.Set;
import java.util.TreeSet;

public class Lab077 {
    public static void main(String[] args) {
        // Immutable
        String s1 = "Pramod";
        String s2 = new String("Pramod");


        // Mutable

        StringBuilder sb3 = new StringBuilder("Pramod");
        sb3.append(" Dutta");
        System.out.println(sb3);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

    }
}
