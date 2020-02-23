package day29;

public class HeroIdentity2 {

    public static void main(String[] args) {

        String hero1 = " Superman-Clark J Kent ";
        //hide this hero identity
        //String herox = "superman****************"

        //given a string with hero code and name separated by -
        //turn this String into hero code and * with same length as hero name

        // plain English logic
        // split it by - to get the code and full name
        //get the length of full name
        //generate stars with same length as full name
        //concatenate herocode with dash and stars and save it
        //OR one the star is generated, replace full name with Stars
        String[] heroSplitted = hero1.split("-");
        String herocode = heroSplitted[0];
        String fullName = heroSplitted[1];

        String stars = "" ;
        for (int i = 0; i <= fullName.length(); i++  ) {
             stars += "*";
             //System.ot.println("stars = + Stars)
            String heroX = hero1.replace(heroSplitted[1], stars);
            System.out.println("hero1 = " + hero1);
         //   System.out.println("heroX = " + hero1.replace(hero1.Split()));
            System.out.println("heroX = " + hero1.replace(hero1.split("-")[1], stars));

        }

    }
}
