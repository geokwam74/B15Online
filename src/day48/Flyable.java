package day48;
// this is how we create an interface
// interface is abstract type just like abstract class
// no object can be created from it
// it provide guideline for implementing classes
// it's like signing a contract
public interface Flyable {
    boolean HAVE_WING = true;

    //an interface can only have public static final field


    // can we have constructor ? : ABSOLUTELY NO !!!!!!!!!!!
    public abstract void fly();

}
