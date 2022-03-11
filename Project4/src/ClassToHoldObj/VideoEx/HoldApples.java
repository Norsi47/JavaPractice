package ClassToHoldObj.VideoEx;

public class HoldApples {

    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        HoldDog holdDog = new HoldDog();
        HoldFish holdFish = new HoldFish();

        animalList.add(holdDog);
        animalList.add(holdFish);

    }

}
