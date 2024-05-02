import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class print_file {
    public static void main (String[] args) {
        File f2 = new File("/Users/macbookair/Desktop/student.txt");
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
