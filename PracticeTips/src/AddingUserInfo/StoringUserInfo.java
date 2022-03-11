package AddingUserInfo;

import java.util.ArrayList;

public class StoringUserInfo {
    public static void main(String[] args) {

        //putting people into array list
        ArrayList<AddUserInfo> addUserInfoArrayList = new ArrayList<>();
        //storing 4 ppl, loop will be done 4 times
        for (int i = 0; i < 4; i++) {
            AddUserInfo addUserInfo = new AddUserInfo();
            //can do sout print but this way is better
            addUserInfo.setFirstName("Norsi" + i);
            addUserInfo.setLastName("Onyekaba" +i);
            //ading all this to loop
            addUserInfoArrayList.add(addUserInfo);
            System.out.println(i);

        }
        //will bring the person out
//        AddUserInfo addUserInfoPeople = new AddUserInfo();
//        //will store the value of 4
//        for (int counter = 0; counter < addUserInfoArrayList.size(); counter++) {
//            addUserInfoPeople = addUserInfoArrayList.get(counter);
//            System.out.println(addUserInfoPeople.getFullName());
//
//        }


    }


}
