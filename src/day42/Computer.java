package day42;

public class Computer {

    //attributes: Computer brand, ram(1-128), price
    //behaviour: runProgram, Calculate----> print brand is running program with the
    //ram (size)
    //runProgram
    //         print brand is running program with the (size)

    //calculate
    // ---------> print brand is calculating
    // add getters to all

    private String brand;
    private int ram;
    private double price;


    public void runProgram(){
        System.out.println(this.brand + "is running program with the ram (size)");

    }
    public void calculate(){
        System.out.println( brand+ "is calculating");

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        // valid ram is 1-128
        if (ram >= 1 && ram <= 128) {
            this.ram = ram;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 20) {
            this.price = price;
        }
    }


    public String toString() {

        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}