package ClassToHoldObj.Practice;

public class NamesMain {

    public static void main(String[] args) {

        FirstName firstName = new FirstName();
        FirstNameList firstNameList = new FirstNameList();
        LastName lastName = new LastName();
        MiddleName middleName = new MiddleName();

        firstNameList.add(firstName);
        firstNameList.add(lastName);
        firstNameList.add(middleName);




    }
}
