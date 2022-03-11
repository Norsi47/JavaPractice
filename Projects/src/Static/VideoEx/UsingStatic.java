package Static.VideoEx;

public class UsingStatic {

    //these are the objects
    private String first;
    private String last;

    //static means each object share the same object
    //no need to always change it due to it being static
    private static int members = 0;

    public UsingStatic(String fn, String ln) {
        first = fn;
        last = ln;
        //will add each members +1
        members ++;
        System.out.printf("Constructor for %s %s, members in club: %d\n", first, last, members);

    }
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
    //has to be static to match
    public static int getMembers() {
        return members;

    }



}
