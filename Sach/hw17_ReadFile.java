import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class hw17_ReadFile {
    public static void main(String[] args) {
        try {
            // Create FileReader
            FileReader f = new FileReader("/Users/macbookair/Desktop/Learn Code/Learn_Java/Sach/hw17.txt");
            // Create BufferedReader
            BufferedReader b = new BufferedReader(f);
            // Read text in line
            String s = b.readLine();
            while(s != null) {
                System.out.println(s);
                s = b.readLine();
            }
            b.close();
            f.close();
        }   catch(IOException e) {
            e.printStackTrace();
        }
    }   
}