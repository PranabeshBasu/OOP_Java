public class ThrowAndThrows {
    private static void readFile() {
        // throw new Exception("it will throw an exception");
        int x = 10 / 0;
    }
    private static void willthrow() throws Exception {
        throw new Exception("It will throw an exception!!");
    }
    public static void main(String[] args) throws Exception {
        try {
            readFile();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        willthrow();
        
    }
}
