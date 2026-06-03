import java.io.*;
class Logger {
    private String path;
    Logger(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        this.path = path;
    }
    public void createlog(String msg) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(msg);
            bw.newLine();
        } catch (Exception e) {
            System.out.println("This file can not be logged "+msg);
        }
    }
}
public class LoggerClass {
    public static void main(String[] args) throws IOException {
        Logger l = new Logger("logs.txt");
        l.createlog("First log - by Pranabesh Basu");
    }
}
