public class Practice2 {

    public static boolean containsBananas(String[] shopping) {
        for (String s : shopping)
            if ("bananas".equalsIgnoreCase(s)) {
                return true;
            }
        return false;
    }

    //comment
    //comment here

    //comment here

    public void printList() {
        String[] list = new String[]{"Apples", "Oranges"};
        for (String s : list) {
            System.out.println(s);
        }

    }

    //comment
    public void addToList(String item) {
        String kiwi = "Kiwi";
        if (item != null) {
            System.out.println(item);

        }
    }

    public void multiLinesString() {

        String someText = "This code can be single\n" +
                " line, press enter in\n " +
                "middl\ne" ;
    }


}
