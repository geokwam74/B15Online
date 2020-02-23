package day24;

public class ShoppingWithArray {

    public static void main(String[] args) {

       // String[] groceryItem = new String[6];
        //String[] groceryItems = new String[] {"apple", "banana", "grapes", "strawberry", "blueberry", "kiwi"};
        String[] groceryItems = {"apple", "banana", "grapes", "strawberry", "blueberry", "kiwi"};

        //print everything in one line
        for (String eachFruit : groceryItems) {
            System.out.print( eachFruit + "--->");

            int itemCount = groceryItems.length;
            int lastItemIndex = itemCount -1;
            String lastFruit = groceryItems[lastItemIndex];

         //   for (!eachFruit.equals(lastFruit) ){

                System.out.print("-->");




        }

    }
}
