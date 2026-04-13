import java.util.*;
interface CarInterface {
    public void start();
    default void noise() {
        System.out.println("The car is making noise!!");
    }
    static void numOfwheels() {
        System.out.println("There are four wheels!!");
    }
}
class ManualCar implements CarInterface {
    public void start() {
        CarInterface.numOfwheels();
        System.out.println("The car is starting");
    }
}
public class AbstractionUsingInterface {
    public static void main(String[] args) {
        CarInterface manualcar = new ManualCar();
        manualcar.start();
        manualcar.noise();
    }
}
