import java.util.*;
//This is a custom class which will work for list of any types
//We just have to define the type of the list while object creation
class GenericClass<T> {
    private List<T> list = new ArrayList<>();

    public void add(T val) {
        list.add(val);
    }
    
    public void removeList() {
        if (list.isEmpty()) {
            System.out.println("List is empty can not remove anything");
        }
        list.remove(list.size() - 1);
    }

    public T getvalue(int index) {
        return list.get(index);
    }

    public void printlist() {
        for (T val: list) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}

public class ExampleGenerics {
    public static void main(String[] args) {
        GenericClass<Integer> obj = new GenericClass<>();
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.printlist();
        System.out.println("value at index 2 is: "+ obj.getvalue(2));
        obj.removeList();
        obj.printlist();
    }
}