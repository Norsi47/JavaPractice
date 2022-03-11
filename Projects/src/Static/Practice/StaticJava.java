package Static.Practice;

public class StaticJava {

    //create objects
    private String first;
    private String last;
    private static int members = 0;

    //puting fn and ln in arguments lets us use it outside class
    public StaticJava(String fn, String ln) {
        first = fn;
        last = ln;
        members ++;
//        System.out.println("First Name: "+fn+ " Last Name: "+ln+
//                " Members are: "+members);
        System.out.printf("FirstName %s, LastName %s, Members are: %d \n"
        , first, last, members);

    }

    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;

    }
    public static int getMembers() {
        return members;
    }





}
