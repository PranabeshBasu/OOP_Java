//Compile Time Polymorphism - Method Overloading
class Calculator {
    //Same Method name with different Parameters
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        //Static Binding
        System.out.println(c.add(2, 3));
        System.out.println(c.add(4, 3, 5));
    }
}
