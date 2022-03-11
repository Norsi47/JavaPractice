public class ArraysInMethodsPractice {
    public static void main(String[] args) {
        int randNumbers [] = {1, 2, 1, 2, 1};
        change(randNumbers);
        for (int x: randNumbers){
            System.out.println(x);

        }



    }
    public static void change(int x []) {
        for (int i = 0; i < x.length; i++) {
            x[i] += 2;

        }

    }
}
