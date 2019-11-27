package day14_string_manipulation;

public class StringStartsEndsWith {
    public static void main(String[] args) {

        String word = "selenium";
        System.out.println(word.startsWith("s"));//true
        System.out.println(word.startsWith("selen"));//true
        System.out.println(word.startsWith("el"));

        //endsWith practice
        System.out.println(word.endsWith("m"));
        System.out.println(word.endsWith("nium"));

        //Mr. -> Man
        //Mrs. -> Married woman
        //Ms. -> Single woman
        //Dr. -> Doctor
        //Prof. -> Professor
        String name = "Mr. Omer";

        if(name.startsWith("Mr.")){
            System.out.println("Man");
        }else if (name.startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if(name.startsWith("Ms.")){
            System.out.println("Single woman");
        }else if(name.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if (name.startsWith("Prof.")){
            System.out.println("Professor");
        }

        //website google.com
        String website = "www.google.com";
        //if website ends with .com -> print "English site"
        //if website ends with .edu -> print "College site"
        //if website ends with .gov -> print "Government site"

        if(website.endsWith(".com")){
            System.out.println("English site");
        }else if (website.endsWith(".edu")){
            System.out.println("College site");
        }else if (website.endsWith(".gov")){
            System.out.println("Government site");
        }

    }
}
