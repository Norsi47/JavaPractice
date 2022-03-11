package MultipleConStructors;

public class MultiConstructorsMain {

    public static void main(String[] args) {

        MultiConstructors multiConstructors = new MultiConstructors();
        MultiConstructors multiConstructors2 = new MultiConstructors(5);
        //will only match with methods that have 2 arguments in it
        MultiConstructors multiConstructors3 = new MultiConstructors(5,13);
        MultiConstructors multiConstructors4 = new MultiConstructors(5, 13, 43);


        //will print first method, need %s to print out time format
        System.out.printf("FirstMethod %s\n", multiConstructors.setMilitaryTime());
        System.out.printf("SecondMethod %s\n", multiConstructors2.setMilitaryTime());
        System.out.printf("ThirdMethod %s\n", multiConstructors3.setMilitaryTime());
        System.out.printf("FourthMethod %s\n", multiConstructors4.setMilitaryTime());
    }


}
