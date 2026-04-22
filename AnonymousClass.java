//This is an interface
interface Sample {
    public void execute();
}
abstract class Sample2 {
    abstract void execute2();
}
public class AnonymousClass {
    public static void main(String[] args) {
        Sample s = new Sample() {
            @Override
            public void execute() {
                System.out.println("This is an executed anonymous class!!");
            }
        };
        s.execute();
        Sample2 s2 = new Sample2() {
            @Override
            public void execute2() {
                System.out.println("This is an executed anonymous class implemented via an abstract class!!");
            }
        };
        s2.execute2();
    }
}
