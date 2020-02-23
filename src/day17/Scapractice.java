package day17;

import java.util.Scanner;

public class Scapractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
