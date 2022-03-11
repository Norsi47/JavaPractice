package ClassToHoldObj.VideoEx;

public class AnimalList {

    private HoldAnimal [] theList = new HoldAnimal[5];
    private int i = 0;

    public void add(HoldAnimal animal) {
        if (i < theList.length) {
            theList[i] = animal;
            System.out.println("Animal added at index "+i);
            i++;
        }

    }

}
