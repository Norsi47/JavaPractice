package Static.VideoEx;

import Static.VideoEx.UsingStatic;

public class UsingStaticMain {
    public static void main(String[] args) {
        UsingStatic usingStatic = new UsingStatic("Megan", "Fox");

        UsingStatic usingStatic2 = new UsingStatic("Natalie", "Portman");

        UsingStatic usingStatic3 = new UsingStatic("Taylor", "Swift");


//        System.out.println(usingStatic.getFirst());
//        System.out.println(usingStatic.getLast());
//        System.out.println(usingStatic.getMembers());
        //another way, will print everthing on here
        System.out.println(UsingStatic.getMembers());

    }
}
