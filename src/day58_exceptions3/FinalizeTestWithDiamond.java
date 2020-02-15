package day58_exceptions3;

import day54_polymorhism.Diamond;

public class FinalizeTestWithDiamond {
    public static void main(String[] args) {
        int n = 0;
       // while(true) {
            System.out.println(n++);
            Diamond d1 = new Diamond();
            Diamond d2 = new Diamond();
            Diamond d3 = new Diamond();

            d1 = null;
            d2 = null;
            d3 = null;

            System.gc(); //Invite / Suggest GC to do clean up
       // }

    }
}
