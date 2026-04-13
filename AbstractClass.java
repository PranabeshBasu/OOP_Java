import java.util.*;

abstract class Car {
    abstract public void start();
    public void noise() {
        System.out.println("The car is making noise!!!");
    }
}
class Manuanl extends Car {
    public void start() {
        System.out.println("The manual car is starting");
    }
}

class Automatic extends Car {
    public void start() {
        System.out.println("The automatic car is starting");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Car manualcar = new Manuanl();
        manualcar.start();
        manualcar.noise();
        System.out.println();
        Car automaticcar = new Automatic();
        automaticcar.start();
        automaticcar.noise();
    }
}