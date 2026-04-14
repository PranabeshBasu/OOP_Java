class Main {
    static void doSomething() {
        System.out.println("It is a static method");
        // return sum(2,3); non static method can not be accessed in a static method
    }
    public int sum(int a, int b) {
        doSomething(); // static methods can be accessed in a non static method
        return a + b;
    }
}
public class NonstaticAndStatic {
    public static void main(String[] args) {
        Main s = new Main();
        System.out.println(s.sum(2, 3));
    }
}