package ClassToHoldObj.Practice;

public class FirstNameList {
    private FirstName firstName[] = new FirstName[5];
    private int i = 0;

    public void add(FirstName firstName1) {
        if (i < firstName.length) {
            firstName [i] = firstName1;
            System.out.println("Names added to index "+i);
            i++;
        }

    }
}
