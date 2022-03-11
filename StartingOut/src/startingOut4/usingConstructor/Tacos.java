package startingOut4.usingConstructor;

public class Tacos {
    private String girlName;

    public  Tacos(String name) {
        girlName = name;
    }

    // the code seems to run fine without these getters and setters
//    public void setGirlName(String name) {
//        girlName = name;
//
//    }
//
//    public String getGirlName() {
//        return girlName;
//    }


    public void solution() {
        System.out.printf("Their name is: %s\n",girlName);

    }

}
