package Static.Practice;

public class StaticJavaMain {
    public static void main(String[] args) {
        StaticJava staticJava = new StaticJava("Jack", "Jacobs");
        StaticJava staticJava2 = new StaticJava("James", "Michaels");
        StaticJava staticJava3 = new StaticJava("Julia", "Roberts");

//
//        System.out.println(staticJava.getFirst());
//        System.out.println(staticJava.getLast());
        System.out.println("Memebers: "+StaticJava.getMembers());

    }
}
