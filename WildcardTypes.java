import java.util.*;

public class WildcardTypes {
    public static void printArray(List<? extends Number> ls) {
        // ls.add(2); Restricts write access
        ls.add(null); //Only It is allowed
        for (Number i: ls) {
            System.out.print(i+" ");
        }
    }
    public static void writeArray(List<? super Integer> ls) {
        ls.add(2);
        ls.add(3);
        // int n = ls.get(0); Read and store not allowed
        System.out.println(ls.get(0));
    }
    public static void main(String[] args) {
        WildcardTypes obj = new WildcardTypes();
        List<Number> ls1 = new ArrayList<>();
        obj.writeArray(ls1);

        List<Object> ls2 = new ArrayList<>();
        obj.writeArray(ls2);

        List<Integer> ls3 = new ArrayList<>();
        ls3.add(2);
        ls3.add(3);
        ls3.add(4);
        obj.printArray(ls3);
    }
}
