package startingOut4;

public class Apples {
    private String girlName;

    //this is a constructor, done by creating method with the same name as class
    public Apples(String name) {
        girlName = name;
    }

    public void setName(String name) {
        girlName = name;
    }
    public String getName() {
        return girlName;
    }

    public void saying() {
        System.out.printf("Your first gf was %s\n", getName());
    }

}
