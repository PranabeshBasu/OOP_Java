import java.util.ArrayList;

public class TryCatch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        // System.out.println(list.get(3)); this is not a valid index of the list
        try {
            int x = 10/0;
            System.out.println(list.get(3)); //Now this block will not execute
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: "+e.getMessage());
        }
        //Multiple catch blocks possible
        catch (Exception e) {
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
}
