import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ex5_11 {
    public static void main(String[] args) {
        try {
            // Create a reader
            FileReader f = new FileReader("/Users/macbookair/Desktop/Learn Code/Learn_Java/Sach/hw16.txt");
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
        }   catch(IOException e) {
            e.printStackTrace();
        }
    }
}
