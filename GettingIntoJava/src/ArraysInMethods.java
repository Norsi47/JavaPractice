public class ArraysInMethods {
    public static void main(String[] args) {
        int norsi [] = {3, 4, 5, 6, 7};
        change(norsi);

        for (int y : norsi) {
            System.out.println(y);

        }

    }
    public static void change(int x[]){
        for (int counter = 0; counter < x.length; counter++){
            x[counter] += 5;

        }

    }

}
