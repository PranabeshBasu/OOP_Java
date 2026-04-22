class OuterforLocalInner {
    int val = 10;
    static String name = "Pranabesh Basu";
    //Method of outer class
    public void executeOuter() {
        final int x = 20;
        //Local Inner class
        class LocalInner {
            public void executeInner() {
                System.out.println("The final value of x is : "+x);
                System.out.println("The value of outer class variable var is: "+val);
            }
        }
        val += 10;
        LocalInner li = new LocalInner();
        li.executeInner();
    }
}


public class LocalInnerMain {
    public static void main(String[] args) {
        OuterforLocalInner ofli = new OuterforLocalInner();
        ofli.executeOuter();
    }
}
