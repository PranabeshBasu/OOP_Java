interface vehicle {
    public void start();
}
interface Car extends vehicle{
    public void mileage();
}
class Manual implements Car {
    public void start() {
        System.out.println("The car is starting!!");
    }
    public void mileage() {
        System.out.println("This car has high mileage!!");
    }
}
public class InterfaceInheritence {
    public static void main(String[] args) {
        Manual m1 = new Manual();
        m1.start();
        m1.mileage();
    }
}
