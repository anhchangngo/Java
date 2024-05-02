
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/*
import java.io.File;
import java.nio.file.Files;
import java.util.List;
 */

public class hw15_ReadFile {
    public static void main(String[] args) {
        try {
            // Create a Reader
            FileReader f = new FileReader("/Users/macbookair/Desktop/Learn Code/Learn_Java/Sach/student.txt");
            // Create BufferedReader
            BufferedReader b = new BufferedReader(f);
            // Read test in file
            String s = b.readLine();
            while(s != null) {
                System.out.println(s);
                s = b.readLine();
            }
            f.close();
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /* 
            // Create a File
            File f = new File("/Users/macbookair/Desktop/Learn Code/Learn_Java/Sach/student.txt");
            try {
                List<String> allText = Files.readAllLines(f.toPath());
                for(String line : allText) {
                    System.out.println(line);
                }
            }   catch (Exception e) {
                e.printStackTrace();
            }
            */
    }
}
