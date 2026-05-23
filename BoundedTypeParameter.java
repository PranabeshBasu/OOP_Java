import java.util.*;

class Calculator <T extends Number> {
    public double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    public double sub(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
    public double div(T num1, T num2) {
        return num1.doubleValue() / num2.doubleValue();
    }
    public double mult(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }
}

public class BoundedTypeParameter {
    public static void main(String[] args) {
        Calculator<Double> obj = new Calculator<>();
        System.out.println(obj.add(2.0, 3.0));
    }
}
