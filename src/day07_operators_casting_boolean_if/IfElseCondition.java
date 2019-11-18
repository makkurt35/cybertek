package day07_operators_casting_boolean_if;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class IfElseCondition {
    public static void main(String[] args) {
        if(10 > 5) {
            System.out.println("Condition is true");
        }else{
            System.out.println("Condition is false");
        }

        int count = 25;
        if(count > 30) {
            System.out.println("Count is more than 30");
        }else{
            System.out.println("Count is less than 30");
        }

        int age = 35;
        if(age >= 18) {
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }


    }
}
