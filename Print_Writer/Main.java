import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Cach 1
        File f = new File("/Users/macbookair/Desktop/Ảnh/Hello.txt");
        try {
        BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
        String line = null;
        while(true) {
            line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    */

    // Cach 2
    File f2 = new File("/Users/macbookair/Desktop/Learn Code/Learn_Java/Sach/student.txt");
    try {
        List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
        for (String line : allText) {
            System.out.println(line);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
