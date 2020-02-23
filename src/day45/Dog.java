package day45;

public class Dog extends Animal {


   // public void speak(){
     //   System.out.println("Bark!@@");

  //  }
   // @Override
    //public void speak(){
      //  System.out.println("BARK!!!");

     //@Overriding happens in parent child relationship
     //  //OVERLOADING VS OVERRIDING
        ////Overloading :same method name & different parameter in the same class
        ////Overriding : parent child relationship is a MUST
        ////has same method name signature & same parameter list ALWAYS





    public static void main(String[] args) {
        Dog twix = new Dog();
        twix.speak();
    }
    //WHY DO WE WANT TO CALL SUPER CLASS
    @Override
    public void speak(){
        //super. can be used to specify we are calling
        //super class version of the method
        //can we use super. or this. outside of instance
        //BIG NO!!!!!!!!!
        //We can use super. or this. as many time as we want.
        super.speak();
        System.out.println("BARK!!!");
        super.speak();
        super.speak();



    }

}
