package SavingUserInfo;

import java.io.IOException;

public class SavingUserInfoMain {

    public static void main(String[] args) throws IOException {

        SavingUserInfoClass savingUserInfoClass = new SavingUserInfoClass();

        savingUserInfoClass.savingFile();
        savingUserInfoClass.addingUserInfo();
        savingUserInfoClass.readingFile();

    }
}
