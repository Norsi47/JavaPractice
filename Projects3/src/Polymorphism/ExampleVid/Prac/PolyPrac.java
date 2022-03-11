package Polymorphism.ExampleVid.Prac;

import Polymorphism.ExampleVid.PolyTuna;

public class PolyPrac {

    public static void main(String[] args) {
//
//        PracFood pracFood[] = new PracFood[3];
//        pracFood[0] = new PracFish();
//        pracFood[1] = new PracTuna();
//        pracFood[2] = new PracFood();
//
//        for (int x = 0; x < 3; x++) {
//            pracFood[x].allFood();
//
//        }

        //Another Way
        PracEat pracEat = new PracEat();
        PracFood pracFood = new PracTuna();
        PracFood pracFood1 = new PracFish();

        pracEat.goAllIn(pracFood);
        pracEat.goAllIn(pracFood1);






    }
}
