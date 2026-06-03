import java.io.File;
import java.io.IOException;
public class FileHandling {
    public static void main(String[] args) {
        File file = new File("PATH/texting.txt");
        System.out.println(file.exists());
        try {
            File newfile = new File("PATH/text.txt");
            if (newfile.createNewFile()) {
                System.out.println("File created successfully"+newfile.getName());
            }
            else {
                System.out.println("file already exists");
            }
        }
        catch(IOException e) {
            System.out.println("An error occured!!");
            e.printStackTrace();
        }
        System.out.println(file.exists());
        System.out.println(file.canRead());
    }
}