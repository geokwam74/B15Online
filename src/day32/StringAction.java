package day32;

public class StringAction {

    public static void main(String[] args) {
       // reversePrintMyOwnName();
        printStringWithDashInBetween("George");
        printStringWithDashInBetween("Ivy");
        printStringWithDashInBetween("Ivory");
        printStringWithDashInBetween("Ezra");
        printStringWithDashInBetween("Cecilia");

    }

    public static void reversePrintMyOwnName() {
        //             012345
        String name = "George";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i != name.length() - 1) {
                System.out.print(" -");
            }
        }
    }


    public static void printStringWithDashInBetween(String gee) {
        String name = "George";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i != name.length() - 1) {
                System.out.print(" -");

    }

            }

    }



}
