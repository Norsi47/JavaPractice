package MoreOnPoly.Prac;

public class PolyMainClass {
    public static void main(String[] args) {
        PolyName polyName[] = new PolyName[2];
        PolyFirstName polyFirstName = new PolyFirstName();
        PolyLastName polyLastName = new PolyLastName();

        polyName[0] = polyFirstName;
        polyName[1] = polyLastName;

        for (PolyName polyName1: polyName) {
            polyName1.randomNames();
        }

    }
}
