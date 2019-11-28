package day15_string_manipulation;

import java.util.Arrays;

public class StringIndexOf {
    public static void main(String[] args) {
        String technologies = "java,c++,python,tomcat,aws";
        System.out.println(technologies.indexOf("java"));
        int java, c, python, tomcat, aws;
        //System.out.println(java); Error. nothing assigned
        java = technologies.indexOf("java");
        c = technologies.indexOf("c++");
        python = technologies.indexOf("python");
        tomcat = technologies.indexOf("tomcat");
        aws = technologies.indexOf("aws");
        int html = technologies.indexOf("html");

        System.out.println("java = " + java);
        System.out.println("c = " + c);
        System.out.println("python = " + python);
        System.out.println("tomcat = " + tomcat);
        System.out.println("aws = " + aws);
        System.out.println("html = " + html);

        //technologies -> how can I check if "c++" is in the technologies String.
        //contains
        //indexOf result is > -1

        if(technologies.contains("c++")){
            System.out.println("c++ is there");
        }else{
            System.out.println("c++ is not present");
        }

        if(technologies.indexOf("c++") > -1){
            System.out.println("c++ is there");
        }else{
            System.out.println("c++ is not present");
        }
        
        int firstComma = technologies.indexOf(",");
        System.out.println("firstComma = " + firstComma);

        //find the last comma in the String
        int lastComma = technologies.lastIndexOf(",");
        System.out.println("lastComma = " + lastComma);

        //How to find second, or third comma?!!
        //"java,c++,python,tomcat,aws"
        System.out.println(technologies.indexOf(",",5 ));
        
        int secondComma = technologies.indexOf(",",5);
        System.out.println("secondComma = " + secondComma);
        //find third comma
        System.out.println(technologies.indexOf("," , secondComma+1));

        String url = "www.cybertekschool.okta.com";
        //find the second . from the url and print index
        
        int firstDot = url.indexOf(".");
        System.out.println("firstDot = " + firstDot);
        int secondDot = url.indexOf("." , firstDot+1);
        System.out.println("secondDot = " + secondDot);

        System.out.println(url.indexOf("." , url.indexOf(".") + 1));

    }
}
