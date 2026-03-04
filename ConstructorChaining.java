class Car {
    String name;
    String color;
    Car(String n, String c) {
        this.name = n;
        this.color = c;
    }
    Car(String n) {
        this(n,"white");
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Car c1 = new Car("Marcedes");
        System.out.println(c1.color);
        System.out.println(c1.name);
    }
}
