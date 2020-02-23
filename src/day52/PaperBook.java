package day52;

public class PaperBook extends Book {

    int weight;


    public PaperBook(String name, String author) {
        super(name, author);
        this.weight = weight ;

    }

    @Override
    public void displayInfo() {
        System.out.println("Paper Book's name is: " + name + "and the author is : " +author +"and it weigh "+ weight +"pound");


    }


}


