package UserInfo;

public class UserInfo {

    int age;
    String name;
    double salary;

    public  UserInfo (String name) {
        //this will give us the option to put in name for user

//        this.name = userInfoName; this is neede if using the same name as variable
        // for example if argument is String name, would do this.name = name
        /*if not done this way another way can be done for example (String userName)
        it would just be name  = userName*/

        this.name = name;

    }

    //variable is made inside parameter to let user manually put it
    public void userAge(int userAge) {
        age = userAge;

    }

    public void userSalary(double userSalary) {

        salary = userSalary;

    }

    public void usersInfo(){
        System.out.println("Users name is: " + name);
        System.out.println("Users age is : "+ age);
        System.out.println("Users Salary is: " + salary);

    }





}
