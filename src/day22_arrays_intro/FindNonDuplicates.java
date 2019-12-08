package day22_arrays_intro;

public class FindNonDuplicates {
    public static void main(String[] args) {
                  //  0123
        String str = "java";
        String unique = "";
                   //"java"
        for (int i = 0; i < str.length(); i++) {
            char outerLetter = str.charAt(i);//read a letter and store
            System.out.println("checking - " + outerLetter);//print
            int count = 0;//reset to 0 each time. to check if duplicates found
            //inner loop to loop through each letter again
            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);
                System.out.println("Comparing Inner loop letter:" + innerLetter);
                //check if letter matches any letter in inner loop
                //also make sure i and j are not same
                //if they are same, it will mean we are looking same letter in same position
                if (innerLetter == outerLetter && i != j){
                    System.out.println(outerLetter +" has a duplicate");
                    count++;
                }
            }
            if(count == 0){
                System.out.println(outerLetter +" is unique.No Duplicates");
                unique+=outerLetter;
            }else{
                System.out.println(outerLetter +" has Duplicates");
            }

        }//outer loop end

        System.out.println("unique = " + unique);



    }
}
