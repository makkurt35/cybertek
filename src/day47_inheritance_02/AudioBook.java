package day47_inheritance_02;

public class AudioBook extends Book {
    private double length;
    private String narrator;
    //Listening to AudioBook written by AUTHOR with title TITLE.
    //Narrated by NARRATOR
    public void listen(){
        System.out.println("Listening to AudioBook written by ["+getAuthor() +
                "] with title ["+getTitle()+"]. Narrated by ["+narrator+"]...");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
}
