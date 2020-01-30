package day49_overriding_final;

import java.util.*;

public class SearchEngine {

    public int search(String item){
        System.out.println("Searching for ... " + item +"\nreturning results count..");
        Character ch ;
        return item.length();
    }

    public int search(String item, String item2){
        System.out.println("Searching for ... " + item +"\nreturning results count..");
        return item.length();
    }

    protected void getResults(){
        System.out.println("Search Engine displaying results....");
    }

    String clickResult(){
        System.out.println("Clicking result of search engine");
        return "SearchEngine item details";
    }
}
