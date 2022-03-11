package toString.Practice;

public class PotPieMain {

    public static void main(String[] args) {
        Potpie potpie = new Potpie(12, 20, 2021);
        PotPieComp potPieComp = new PotPieComp("Norsi", potpie);

        System.out.println(potPieComp);


    }
}
