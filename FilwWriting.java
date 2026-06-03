import java.io.*;
public class FilwWriting {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("text.txt"));
            bw.write("Hello my name is Pranabesh Basu");
            bw.flush(); // To write into file instantly
            bw.newLine();
            bw.write("I am proficient in Java");
            bw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            bw.close();
        }
    }
}
