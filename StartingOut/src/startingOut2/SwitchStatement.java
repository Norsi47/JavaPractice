package startingOut2;

public class SwitchStatement {
    //Similar to if statements 3
    public static void main(String args[]) {
        int age;
        age = 7;

        //switch is similar to if statements but better to use for multiple variables
        //the numbers in front if case are called values
        switch (age) {
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("You can get in trouble");
                break;
            default:
                System.out.println("I do not know how old you are");
                break;
        }

//        String password;
//        password = "finger";
//
//        switch (password) {
//            case "fish" :
//                System.out.println("this is not it");
//                break;
//            case"finger":
//                System.out.println("You got it");
//                break;
//            default:
//                System.out.println("Keep trying");
//
//
//        }

    }

}

