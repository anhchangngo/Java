import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class ex5_8 {
    public static void main(String[] args) {
        Cow c1 = new Cow(true, "VietNam");
        Cow c2 = new Cow(false, "Kobe");
        Cow c3 = new Cow(true, "ThaiCong");

        try {
            FileOutputStream fout = new FileOutputStream("ex5_8.txt");
            // Create an ObjectOutputStream
            ObjectOutputStream out = new ObjectOutputStream(fout);
            // Write Object to output stream 
            out.writeObject(c1);
            out.writeObject(c2);
            out.writeObject(c3);
            out.close();
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
}
