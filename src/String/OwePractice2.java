package String;

import java.util.ArrayList;
import java.util.Arrays;

public class OwePractice2 {

    public static void main(String[] args) {



        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));

        for(String eachProduct : productLst);


        //String namePart = eachProduct.split(",")[0];
        System.out.println("productLst = " + productLst);
    }
}
