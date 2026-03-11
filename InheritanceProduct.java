class Product {
    private String name;
    private double price;
    private String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Category: "+category);
    }
}
class Electronics extends Product {
    private int warrantyPeriod;
    private String brand;

    Electronics(int warrantyPeriod, String brand, String name, double price) {
        super(name, price, "Electronics");
        this.warrantyPeriod = warrantyPeriod;
        this.brand = brand;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: "+warrantyPeriod);
        System.out.println("Brand: "+brand);
    }
}
class Cloths extends Product {
    private String size;
    private String color; 
    Cloths(String size, String color, String name, double price) {
        super(name, price, "Cloths");
        this.size = size;
        this.color = color;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: "+size);
        System.out.println("Color: "+color);
    }

}
public class InheritanceProduct {
    public static void main(String[] args) {
        Product ele = new Electronics(2, "Sony", "TV", 20000);
        ele.displayDetails();
        Product tshirt = new Cloths("S", "Black", "Tshirt", 1000);
        tshirt.displayDetails();
    }
}