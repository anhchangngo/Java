import java.io.PrintWriter;
public class ViduGhitext {
    public static void main(String[] args) {
        try {
        PrintWriter pw = new PrintWriter("/Users/macbookair/Desktop/Ảnh/Hello.txt", "UTF-8");
        pw.println("Hello mình là Đạt");
        pw.print(3.14);
        pw.print(' ');
        pw.print(true);
        pw.println();

        Student st = new Student(1, "Đạt");
        pw.print(st);

        pw.flush();
        pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
