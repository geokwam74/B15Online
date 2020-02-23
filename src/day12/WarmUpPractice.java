package day12;

public class WarmUpPractice {
    public static void main(String[] args) {

        //if weather Sunny
        //If Weather Rainy
        //If Weather Cloudy
        //If Weather Snowy
        String weather = new String ("Sunny");
        if (weather.equals("Sunny")) {
            System.out.println("code in Sunny weather");
        } else if (weather.equals("Rainy")) {
            System.out.println("code in Rainy weather");
            if (weather.equals("Cloudy")) {
                System.out.println("code in Cloudy weather");
            } else if (weather.equals("Snowy")) {
                System.out.println("code in Snowy waether");
            }else{
                System.out.println("rain or shine keep coding anyway ");

            }

            }




    }

}

