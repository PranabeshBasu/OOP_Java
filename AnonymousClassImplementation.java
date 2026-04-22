import java.util.ArrayList;

public class AnonymousClassImplementation {
    public static void main(String[] args) {
        //We can use anonymous classes not only just implementing contracts;
        //We can use it for overriding multiple methods of data structures;
        ArrayList<Integer> list = new ArrayList<>(){
            public boolean add(Integer e) {
                if (e % 2 == 0) super.add(e);
                return true;
            }
        };
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
