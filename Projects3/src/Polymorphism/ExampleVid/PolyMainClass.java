package Polymorphism.ExampleVid;

public class PolyMainClass {
    public static void main(String[] args) {

        //using polymorphism
//        IntroPoly polyTuna = new PolyTuna();

//        IntroPoly bucky[] = new IntroPoly[2];
//        bucky[0] = new PolyPotPie();
//        bucky[1] = new PolyTuna();
//
//        for (int x=0; x<2; ++x) {
//            bucky[x].eat();
//        }

        EatClass eatClass = new EatClass();
        IntroPoly introPoly = new IntroPoly();
        IntroPoly introPoly1 = new PolyPotPie();

        eatClass.digest(introPoly);
        eatClass.digest(introPoly1);


    }
}
