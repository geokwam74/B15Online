package day06;

public class UsingOtherVariablesVaulue {
    public static void main(String[] args) {

        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        yourFavoriteNumber = 100;
        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        //create a variable called yourOrder, type the String and assign a value
        //create another variable called myOrder and assign the value
        //to same value as youOrder by copying
        //and just print them out.

        String yourOrder = "Gucci bag" ;

        String myOrder = yourOrder;

        System.out.println("Your Order is " +yourOrder + "\n" + "My order is" + myOrder) ;




    }
}
