package day64;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        //what  if we want to have multiple value for one key??
        //for
        Map<String, List<String> > groupMap = new HashMap<>();

        groupMap.put("PowerOf4" , Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupMap.put("Achievers" , Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like")  );
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));

     //   System.out.println("groupMap = " + groupMap);

        groupMap.forEach((groupCode,allNumber) -> System.out.println("groupCode = " + groupCode +"\n\t numbers :" +allNumber));
        System.out.println( groupMap.get("Achiever").get(3));
        //check whether this map has Gulzina or not in BugHunter?


        System.out.println( groupMap.get("BugHunter").contains("Gulzina"));






    }
}
