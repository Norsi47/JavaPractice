package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayLists {
    public static void main(String[] args) {

        ArrayList <Integer> userAge = new ArrayList<>();
        userAge.add(12);
        userAge.add(24);
        userAge.add(30);

        List<String> userName = new ArrayList<>();
        userName.add("Norsi");
        userName.add("Onyekaba");

        for(int advLoop : userAge) {
            System.out.println("Using Advance" +advLoop);
        }

        for (int i = 0; i < userAge.size(); i++) {
            System.out.println("For Loop" +userAge);
        }

        int[] ranArray = {12, 41, 47, 26};
        for (int ran : ranArray) {
            System.out.println("RandomArray "+ran);
        }
            for (int i = 0; i < ranArray.length; i++) {
                System.out.println("For Loop for RanArray "+ "Loop "+i +" " + ranArray[i]);
            }



    }


}
