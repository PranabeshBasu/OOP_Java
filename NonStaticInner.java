class OuterClass {
    static int val = 0;
    String name = "Pranabesh Basu";
    class NonStaticInner {
        public void execute() {
            System.out.println("It is a non static inner class!!");
            System.out.println("We can access the static member val and the value is: "+val);
            System.out.println("We can access the non static member as well which is: "+name);
        }
    }
}

public class NonStaticInner {
    public static void main(String[] args) {
        //To access the inner class we need object/instance of the outer class
        OuterClass.NonStaticInner in = new OuterClass().new NonStaticInner();
        in.execute();
    }
}
