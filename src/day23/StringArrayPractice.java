package day23;

public class StringArrayPractice {

    public static void main(String[] args) {

        String[] shows ={"orvilla", "Gifted", "Throne", "Flash", "Arrow" , "Supper  girl"};
        int showsCount = shows.length ;
        System.out.println("showsCount = " + showsCount);

        for ( int x =0; x < showsCount; x++) {
            String currenntShow = shows[x];
            System.out.println( currenntShow + " has character count :" + currenntShow.length() );




















        }
    }
}
