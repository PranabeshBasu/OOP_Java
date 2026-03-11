class Parent {
    void printDesc() {
        System.out.println("This is a parent Method");
    }
    static void printDesctwo() {
        System.out.println("This is a static method");
    }
}
class Child extends Parent {
    @Override
    void printDesc() {
        Parent.printDesctwo(); // Triggering static method in child class
        super.printDesc();
        System.out.println("Addition to the business logic of parent class");
    }
    /* @Override
        void printDesctwo() {
         System.out.println("Static method overridden");
        } 
    */ //static methods can not be overridden
}
public class StaticMethodInvoking {
    public static void main(String[] args) {
        Child c = new Child();
        c.printDesc();;
    }
}
