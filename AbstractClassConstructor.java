import java.util.*;
abstract class Car {
    Car() {
        System.out.println("This is a default constructor!!");
    }
    abstract public void start();
    public void noise() {
        System.out.println("The car is making noise!!!");
    }
}
abstract class Dealer extends Car {
    private int numOfcars;
    Dealer() {
        System.out.println("This is the default constructor of Dealer class!!");
    }
    Dealer(int numOfcars) {
        this.numOfcars = numOfcars;
        System.out.println("The number of car deals are: "+this.numOfcars);
    }
}
class Manual extends Dealer {
    Manual(int num) {
        super(num);
        System.out.println("This is the constructor of Manual car class");
    }
    @Override
    public void start() {
        System.out.println("The car is starting!!");
    }
}
public class AbstractClassConstructor {
    public static void main(String[] args) {
        Manual manualcar = new Manual(2);
        manualcar.start();
        manualcar.noise();
    }
}
