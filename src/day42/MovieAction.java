package day42;

public class MovieAction {

    public static void main(String[] args) {

      Movies m1 = new Movies();
       System.out.println("m1 = " + m1);

        Movies m2 = new Movies("Joker" , 2.2, "Drama");
        Movies m3 = new Movies("Frozen2", 1.5, "Family");
        Movies m4 = new Movies("Pursuit of Happiness", 2.0, "Drama");

        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);

        // I WANT TO GET THE name OF M2 SEPARATELY SO I CAN DO SOME STUFF
        // I can not access the field directly because it's private
        // i need a getter method to access
        // System.out.println(m2.name);
        System.out.println(m2.getName());







    }

}

