package MultiDImensionalArrays;

public class MultiArraysPrac {
    public static void main(String[] args) {
        int randomArray [][] = {{32, 42, 11, 10},
                {14, 12, 15, 15}, {45}};
        int randomNum [][] = {{12, 21, 15, 17}, {10, 13, 18, 17}, {35}};


//        String randomLetters [][] = {{"Fish","Dead", "Fisher-Man"}, {"Jack Fisher", "Helen Fisher"}};

        System.out.println("First Array");
        display(randomArray);

        System.out.println("Second Array");
        display(randomNum);

    }

    // need to put variable in parameter()
    public static void display(int x[][]) {
        //loop to print row
        for (int row = 0; row < x.length; row++) {

            //will print column of exactly what is on there
            for (int column = 0; column < x[row].length; column++) {
                //\t is used to seperate each row
                System.out.print(x[row][column]+"\t");
            }
        }
        //will leave space after first array is printed
        System.out.println();

    }

}
