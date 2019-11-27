package day14_string_manipulation;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "employee@yahoo.com";

        if(email.contains("@gmail")){
            System.out.println("Google Account");
        }else if(email.contains("@yahoo")){
            System.out.println("Yahoo account");
        }else if(email.contains("@hotmail")){
            System.out.println("Hotmail account");
        }else if(email.contains("@icloud")){
            System.out.println("Apple account");
        }else{
            System.out.println("Some other account");
        }

    }
}
