class ABC {
    static int a = 0;
    static {
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 2");
    }
}
class StaticBlock {
    public static void main(String[] args) {
        System.out.println("The value of a is: "+ABC.a);
    }
}
