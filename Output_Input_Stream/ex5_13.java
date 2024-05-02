import java.io.PrintWriter;
import java.io.IOException;

public class ex5_13 {
    public static void main(String[] args) {
        double d = 25.5;
        boolean b = true;
        int i = 10;
        try {
            PrintWriter pw = new PrintWriter("ex5_13.txt");
            pw.print(d + " " + b + " " + i);
            pw.close();
        }   catch(IOException e) {
            e.printStackTrace();
        }
    }
}
