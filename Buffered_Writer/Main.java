
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String txt = "Do Trong Dat";
        String arr[] = {"Dat", "Tun", "Bong"};
        try {
            FileWriter fw = new FileWriter("text.txt", true); // khởi tạo file
            BufferedWriter bw = new BufferedWriter(fw);  // ghi dữ liệu file
            // bw.write(txt);
            for(String s : arr){
                bw.write(s);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
