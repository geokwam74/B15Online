package day30;

public class ReviewArrayCarInventory {

    public static void main(String[] args) {

        /*
        {carmake
        Accura NXS
        Chevrolet - Corvertte
         */

    String[] cars = {"Acura-NSX",
                    "Chevrolet-Corvette",
                    "Chevrolet-Cavalier",
                    "BMW-3 Series",
                    "Pontiac-LeMans",
                    "BMW-7 Series",
                    "Oldsmobile-Achieva",
                    "Honda-CivicCNT"};
    int chevyCNT = 0;
    int civiCNT  = 0;
    //Task1 : count Chevrolet and civi
    //we can use contains , starWith , endWith to get same result

    for (String  eachCar :cars) {
        if (eachCar.toLowerCase().startsWith("Chevrolet")) {
            chevyCNT++;
        }
        if (eachCar.toUpperCase().contains("Civi")) {
            civiCNT++;
        }
        System.out.println("chevyCNT = " + chevyCNT);
        System.out.println("civiCNT = " + civiCNT);
    }


    }

}
