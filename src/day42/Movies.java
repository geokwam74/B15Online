package day42;

public class Movies {

    String name;
    double length;
    String type;

    // default constructor :
    // a constructor that give by compiler
    // only if you don't have any constructor in your class
    // it's invisible
    // and it has no parameter
    // it has no code inside
    //write constructor to set all the fields value
    public Movies(){
        System.out.println("EMPTY MOVIE");
    }

    public Movies(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    // toString method so we can directly print out

    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
