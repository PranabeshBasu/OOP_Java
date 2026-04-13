import java.util.*;

abstract class Car {
    abstract public void start();
    public void noise() {
        System.out.println("The car is making noise!!!");
    }
}
// Abstract class extending another abstract class
abstract class Dealer extends Car {
    abstract public void isItopen();
}
class Manuanl extends Dealer {
    @Override
    public void start() {
        System.out.println("The manual car is starting");
    }
    @Override
    public void isItopen() {
        System.out.println("Yes the car is open!!");
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
        System.out.println();
        Dealer car = new Manuanl();
        car.start();
        car.isItopen();
        car.noise();
    }
}