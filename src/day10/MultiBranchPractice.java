package day10;

public class MultiBranchPractice {



    public static void main(String[] args) {

        // At the McDonald Drive thru
        System.out.println(" Welcome McDonald, What can get for you");

        /*
        * 1. burger
        * 2. French Fry
        * 3. Nuggets
        * 4. Ice cream
        * 5. coke
        *
         */
        String order = "";
        int itemNumber = 88;

        if (itemNumber == 11) {
            System.out.println("You have selected 11");
            order = "Burger";
        } else if (itemNumber == 5) {
            System.out.println("You have selected 5");
            order = "French Fry";
        } else if (itemNumber == 8) {
            System.out.println("You have selected 8");
            order = "Nuggets";
        } else if (itemNumber == 35) {
            System.out.println("You have selected 35");
            System.out.println("YAY!!! YUM!!! ");
            System.out.println("ENJOY!!!! ");
            order = "Ice Cream";
        } else {
            System.out.println("YOU HAVE SELECTED UNKNOWn ITEM NUMBER@!!");
            order = "Unknown";
        }

        System.out.println("Your order is " + order);


    }

}


