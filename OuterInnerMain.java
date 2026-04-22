class Outerclass {
    int val = 10; // Non static variable
    static String name = "Pranabesh Basu";
    //Static Nested Inner Class 
    static class Innerclass {
        public void execute() {
            //Can access name because it is static member of the outer class
            System.out.println("This is the inner class created by: "+name);
        }
    }
    //Now I want to access the inner class method in outer class
    public void execute() {
        //We have to create an instance of Innerclass
        Innerclass in = new Innerclass();
        in.execute();
    }

}
public class OuterInnerMain {
    public static void main(String[] args) {
        Outerclass.Innerclass inner = new Outerclass.Innerclass();
        inner.execute();
        //Without creating an instance of Innerclass we can access the method of it.
        Outerclass out = new Outerclass();
        out.execute();
    }
}