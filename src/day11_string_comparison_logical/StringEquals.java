package day11_string_comparison_logical;

public class StringEquals {
    public static void main(String[] args) {
        String str = "java";
        String str2 = new String("java");
        //compare using ==
        System.out.println(str == "java");//true
        System.out.println(str2 == "java");//false

        //compare using .equals() method. compare char by char
        System.out.println(str.equals("java"));//true
        System.out.println(str2.equals("java"));//true
        System.out.println(str2.equals("Java"));//false - J and j are different

        //compare using .equalsIgnoreCase() method
        System.out.println(str.equalsIgnoreCase("JAVA"));//true
        System.out.println(str2.equalsIgnoreCase("Java"));//true

        //with variables
        System.out.println(str.equalsIgnoreCase(str2)); //true
        System.out.println(str.equals(str2));//true
        System.out.println(str == str2);//false. they are created differently


    }
}
