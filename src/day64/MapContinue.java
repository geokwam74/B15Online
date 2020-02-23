package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapContinue {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

        //map view:
        //KeySet view, values view, entrySet view
     //How do I store all the keys into a Collection
     //what do you think the data type will be to store such collection ?

        // --- Set  because keys are unique

        // we can use keySet() method of Map to get Set of Keys
        Set<String> allNames = groceryPriceMap.keySet();
        System.out.println("allNames = " + allNames);
        allNames.remove("Tomato");
        System.out.println("allNames  no Tomato = " + allNames);
    }

}
