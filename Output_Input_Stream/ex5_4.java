import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class ex5_4 {
    public static void main(String[] args) {
        try {
        FileInputStream fin = new FileInputStream("/Users/macbookair/Desktop/out.dat");
        // Create an ObjectInputStream
        ObjectInputStream in = new ObjectInputStream(fin);
        // Read stored object from the input stream 
        Cow c = (Cow) in.readObject();
        while(c != null) {
            System.out.println("Cow object from " + c.breed + " Has Milk " + c.hasMilk);
            c = (Cow) in.readObject();
        }
        in.close();
    }  catch (ClassNotFoundException e) {
        e.getStackTrace();
    }
       catch (IOException e) {
        e.getStackTrace();
       }
}
}
