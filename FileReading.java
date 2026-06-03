import java.io.*;
public class FileReading {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println("Line: "+s);
            }
            // int ch;
            // while ((ch = br.read()) != -1) {
            //     System.out.println((char) ch);
            // }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
