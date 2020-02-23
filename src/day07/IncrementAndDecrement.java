package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {
        int offer = 2;
        offer +=1; //3
        ++offer; //4  ++will increase the # variable by

        int apple = 10;
        apple = apple + 1;
        apple +=1 ;
        ++ apple ; //this increasing the value by one short cut using ++
        ++ apple ;
        System.out.println("used ++ twice then apple is " + apple);


        //apple = apple -1;
        //apple -=1;
        -- apple;
        System.out.println("used -- once then apple is " + apple);

        //System.out.println( ++apple );
        System.out.println("used ++ to increment and concatenate : " +   (++ apple) );

        //create 3 String variable for first name last name, compny
        //create another for email
        //create email in this format fisrtName_lastName@company
        //print out the result as, my name is (your full name) and I work for <company> and my email is <email>

        String firstName = "George" ;
        String lastName  = "Sarpong ";
        String companyName = "Verizon" ;
        String email ="George_Sarpong@Verison.com";
        //firstName + "_" + lastName@company.com George_Sarpong@Verison.com
        System.out.println(" myName is " + firstName + lastName + "and I worked for " + companyName);



        System.out.println("What is your first name ? " );
        System.out.println("My fist name is " + firstName + "my last name is " +lastName +"and my email is " + email);







    }
}
