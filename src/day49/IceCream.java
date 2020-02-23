package day49;

//can a class both extend another class and implement an interface? Yes you can.

public class IceCream extends Object implements Edible{
    @Override
    public void eat() {
        System.out.println("Eat with spoon");

    }

    @Override
    public void drink() {
        System.out.println("drink it if it has melted");

    }

    @Override
    public void digest() {

    }

    public static void main(String[] args) {
        IceCream i1= new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
        i1.digest();

        // since Object class exists , we can create object out of it
        //Object o1 = new Object();

    }

      }







