package day30;

public class OfficeHour {

    public static void main(String[] args) {

        String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";


        int startingIndex = employee.indexOf("[") + 1 ;
        int endingIndex = employee.indexOf("]") ;
        String title = employee.substring(startingIndex,endingIndex);
        System.out.println("title = " + title);

        /* print all FirstName-lastName jobTitle
        for example :
        Philipa-Salthouse Electrical Engineer
        Ulrika-

         */
        String fullName = employee.substring(0,employee.indexOf(" ["));
        System.out.println("fullName = " + fullName);
        String fullNameWithDash = fullName.replace(" ", "-");
        System.out.println("fullNameWithDash = " + fullNameWithDash);
        System.out.println(fullNameWithDash  + " " + title);

        if ( title.equals("Elevtrical Engineer")) {
            System.out.println("PASS: verification successful");
        }else {
            System.out.println("FAIL: verification successful" );
        }

    }
}
