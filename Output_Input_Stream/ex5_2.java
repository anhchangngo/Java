import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class ex5_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/Users/macbookair/Desktop/test.dat");
            // Create a DataInputStream object
            DataInputStream in = new DataInputStream(fin);
            // Read primitive values 
            double d = in.readDouble();
            boolean b = in.readBoolean();
            int i = in.readInt();
            System.out.println("Read Primitives : " + d + " , " + b + " , " + i);
        }
          catch (IOException e) {
            e.printStackTrace();
        }
    }
}
