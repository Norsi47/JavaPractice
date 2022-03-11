package Enumeration.VideoExample;

import java.util.EnumSet;

public class EnumMain {

    public static void main(String[] args) {
        //people is made up, the constants in Enum class are already Arrays
        //use className.values() to get arrays
        for (Enum people: Enum.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

            System.out.println("\nAnd for the Range!\n");

            //this will start at kelsey and end at candy
            for(Enum people: EnumSet.range(Enum.kelsey, Enum.Candy))
                System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());




    }

}
