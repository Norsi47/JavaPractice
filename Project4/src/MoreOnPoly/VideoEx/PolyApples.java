package MoreOnPoly.VideoEx;

public class PolyApples {
    public static void main(String[] args) {

        PolyAnimal polyAnimal[] = new PolyAnimal[2];
        PolyDog polyDog = new PolyDog();
        PolyFish polyFish = new PolyFish();

        polyAnimal[0] = polyDog;
        polyAnimal[1] = polyFish;

        for (PolyAnimal x: polyAnimal) {
            x.noise();

        }


    }
}
