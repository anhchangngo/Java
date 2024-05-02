import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;

public class ex5_6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("ex5_6.dat");
            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeDouble(4.5);
            dout.writeUTF("Anh Dat Dep Trai");
            dout.writeChar('8');
            dout.writeBoolean(true);
            dout.writeInt(25);
            // close Stream
            fout.close();
            dout.close();
        }   catch(IOException e) {
            e.printStackTrace();
        }
    }
}
