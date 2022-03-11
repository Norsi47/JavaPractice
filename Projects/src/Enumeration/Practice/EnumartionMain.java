package Enumeration.Practice;

import java.util.EnumSet;

public class EnumartionMain {
    public static void main(String[] args) {
        for (Enumaration people : Enumaration.values()) {
            System.out.printf("%s\t%s\t%s\t\n", people, people.getDesc(), people.getAge());

        }
        System.out.println("\nRange People\n");

        for (Enumaration people: EnumSet.range(Enumaration.SashaGrey, Enumaration.Adrianna)) {

            System.out.printf("%s\t%s\t%s\t\n", people, people.getDesc(), people.getAge());
        }




    }
}
