package Part1;

public class UserName {

    public int age;
    public String name;

    public void info() {
        age = 45;
        name = "JackNeHuf";



    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
//toString is needed to print out line 8, the method info()
    public String toString() {
        return String.format("%s, %s", age, name);
    }

}
