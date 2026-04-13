import java.util.*;
//Interface 1
interface Car {
    static final int count = 0; // That's how we define variables in interface...these are not instance variable
    public void start();
    public void noise();
    default void isthereAirBags() {
        System.out.println("There are 6 air bags present in the car!!");
    }
    static void mileage() {
        System.out.println("This car has high mileage!!");
    }
}
//Interface 2
interface sunRoof {
    public void whichSunRoof();
}
class Manual implements Car, sunRoof {
    public void start() {
        System.out.println("The car is starting....");
    }
    public void noise() {
        System.out.println("The car is making noise!!");
    }
    @Override
    public void isthereAirBags() {
        System.out.println("There are 4 air bags");
    }
    public void whichSunRoof() {
        System.out.println("The manual car has a normal sunroof");
    }
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        Manual m1 = new Manual();
        m1.start();
        m1.whichSunRoof();
    }
}
