package day23_arraysday2;

public class StudentsList {
    public static void main(String[] args) {
        String[] students = new String[9];
        students[0] = "Edilbek";
        students[1] = "Aika";
        students[2] = "Tahmina";
        students[3] = "Violetta";
        students[4] = "Gunel";
        students[5] = "Yana";
        students[6] = "Alina";
        students[7] = "Catalina";
        students[8] = "Murodil";

        String[] students2 = {"Edilbek", "Aika", "Tahmina",
                             "Violetta","Gunel","Yana",
                              "Alina", "Catalina", "Murodil"};

        //print students count
        //"Total students: 9"
        System.out.println("Total students: " + students.length);
        //print first student:
        System.out.println("First student : " + students[0]);
        System.out.println(students[0].toUpperCase());
        //using For loop print.
        //Edilbek >> 7
        //Aika >> 4
        //Tahmina >> 7
        //..
        for(int i = 0; i < students.length; i++){
            System.out.println((i+1)+". "+students[i] + " >> " + students[i].length());
        }

        //for each loop :
        for(String friend : students){
            System.out.println(friend +" >> "+ friend.length());
        }
        
        String friend1 = students[0];
        System.out.println("friend1 = " + friend1);

        //for each loop :
        //declare counter and set to 0
        int counter = 0;
        for(String friend : students){
            System.out.println(counter+". "+friend +" >> "+ friend.length());
            //increment ++
            counter++;
        }

        String allFriends = "";//Edilbek, Aika ..
        
        for(String friend : students){
            allFriends += friend +", ";
        }
        //remove last ", "
        allFriends = allFriends.substring(0, allFriends.length()-2);
        System.out.println("allFriends = " + allFriends);

        //Print 2 friends at a time.
        /*
        "Edilbek", "Aika"
        "Tahmina", "Violetta"
        "Gunel", "Yana"
        "Alina", "Catalina"
        "Murodil"
        */

        for(int i = 0; i < students.length; i += 2){
           // System.out.println("i : " + i);
            if(i == students.length-1){ // check if i is at last index
                System.out.println(students[i]);
            }else {
                System.out.println(students[i] + ", " + students[i + 1]);
            }
        }
       //0 [1] 2 [3] 4 [5] 6 [7] 8

    }
}
