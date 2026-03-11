//Runtime Polymorphism - Method Overloading
class Parent {
    public void print() {
        System.out.println("This is the parent method!!");
    }
}
class Child extends Parent {
    @Override
    public void print() {
        System.out.println("Parent method overridden!! This is the child class!!");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        //Dynamic Binding
        Child c1 = new Child();
        c1.print();

    }
}