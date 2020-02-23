package day17;

public class StringPractice {
    public static void main(String[] args) {

        String fullName= "George Sarpong-Barnor";
        String firstName = fullName.substring(0,6);
        String lastName = fullName.substring(5);
        String firstNameCorrected = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        System.out.println(firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);
        fullName = firstNameCorrected + " " +lastNameCorrected;
        System.out.println(fullName);







    }
}
