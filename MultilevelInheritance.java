class Animals {
    public void display() {
        System.out.println("Animal eats food");
    }
}
class Mammals extends Animals {
    @Override
    public void display() {
        super.display();
        System.out.println("This mammal walks");
    }
}
class Dog extends Mammals {
    @Override
    public void display() {
        super.display();
        System.out.println("The dog barks");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
