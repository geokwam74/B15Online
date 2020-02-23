package day48;


import java.util.Arrays;
import java.util.List;

public class HR_STUFF {

    public static void main(String[] args) {


        //Employee is abstract super type
        // HourlyEmpolyee and FullTimeEmployee is specific types
        // if we have Employee data type for e1 variable
        //we can write down the address of anything IS-A-Employee

        Employee e1 = new HourlyEmployee("George", 101, 55, 2000);
      //  e1.calculateAnnualSalary();
      //           e1 = new FullTimeEmployee("George", 103, 10000);
     //   e1.calculateAnnualSalary();

        Employee e2 = new HourlyEmployee("Christa", 102, 57, 2080);
        Employee e3 = new FullTimeEmployee("Ivy", 104, 13000);


        //What is the easiest way to store these 3 objects together
        //creating a list with 3 Employee object

        List<Employee>allEmployee = Arrays.asList(e1, e2, e3);

        for (Employee each:allEmployee){
          //  System.out.println("each = " + each);
            System.out.println("Name is : " + each.name);
            each.calculateAnnualSalary();
        }
    }
}
