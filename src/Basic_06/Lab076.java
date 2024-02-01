package src.Basic_06;

import java.lang.reflect.Array;

public class Lab076 {
    public static void main(String[] args) {
        //String reverse
        String name="Sneha";
        char[] charArray=name.toCharArray();
        System.out.println(charArray.length);
        //o/p--> ahens
        int left=0;
        int right=charArray.length-1;
//        while(left < right){
//            char temp = charArray[left];
//            charArray[left] = charArray[right];
//            charArray[right] = temp;
//
//            left++;
//            right--;
//        }
//
//        String rev_name = new String(charArray);
//        System.out.println(rev_name);
String y="";
        for(int i=right;i>=0;i--){
            y=y+name.charAt(i);
        }
        System.out.println(y);
    }
}
