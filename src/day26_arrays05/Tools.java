package day26_arrays05;

public class Tools {
    public static void main(String[] args) {
        String[] tools = {"java","selenium","git","junit","jenkins","cucumber" };

        for(String toolName : tools){
            //System.out.println(toolName);
            if(toolName.equals("java")){
                System.out.println(toolName +" -> fun programming language");
            }else if (toolName.equals("selenium")){
                System.out.println(toolName +" -> test automation");
            }else if (toolName.equals("git")){
                System.out.println(toolName +" -> version control");
            }else if (toolName.equals("junit")){
                System.out.println(toolName +" -> testing tool");
            }else if (toolName.equals("jenkins")){
                System.out.println(toolName +" -> continious integration");
            }else if (toolName.equals("cucumber")){
                System.out.println(toolName +" -> BDD style testing");
            }
        }

    }
}
