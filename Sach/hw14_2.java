import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class hw14_2 {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("/Users/macbookair/Desktop/Learn Code/Learn_Java/Sach/employee.txt");
            BufferedReader b = new BufferedReader(f);
            String s = b.readLine();
            while(s != null) {
                System.out.print(s);
                s = b.readLine();
            }
            f.close();
            b.close();
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
}
