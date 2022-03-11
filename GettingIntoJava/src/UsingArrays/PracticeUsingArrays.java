package UsingArrays;

public class PracticeUsingArrays {
    public static void main(String[] args) {

        System.out.println("Random Numbers");

        String texts[] = {"Selfish", "Thoughts", "fisher"};
        int numbers[] = {23, 16, 24, 00, 16};

        for (int i = 0; i < texts.length; i++) {
            System.out.println("Number of Loop: " + i + " Texts are: " + texts[i]);
        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.println("Numbers " +numbers[j]);
        }

            ///
//            String[] columns = {"name", "age", "country", "height"};
//            String text[][] = {{"emil", "23", "sweden", "180"},
//                    {"jojo", "98", "murica", "200"},
//                    {"hershel", "40", "mexico", "175"}};
//
//            for (int i = 0; i < columns.length; i++) {
//                System.out.print(columns[i] + "\t");
//            }
//
//            System.out.println("\n");
//            String newText = "";
//
//// iterates through each row i in the text array
//            for (int i = 0; i < text.length; i++) {
//                // goes through each word j in the row of i
//                for (int j = 0; j < text[i].length; j++) {
//                    //add the word and a tab between the columns
//                    newText += text[i][j] + "\t";
//                }
//                //after each row, add new line
//                newText += "\n";
//            }
//            System.out.println(newText);
//
//        }
    }
}

