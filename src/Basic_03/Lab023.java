package src.Basic_03;

public class Lab023 {
    public static void main(String[] args) {
        String name="Sneha Susan Sabu";
        String name1= "Sneha Susan Sabu";
        String name2= new String("Sneha Susan Sabu");
        //System.out.println(name==name1);
       // System.out.println(name.equals(name1));

        System.out.println(name==name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));


    }
}
