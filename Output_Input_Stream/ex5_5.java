/*
- OutputStream : built-in abstract class in the java.io package that represent an output data stream 
of bytes. This class is helpful for handling raw data sources like binary files, console output, or memory data

- Class OutputStream : class hỗ trợ xuất dữ liệu thông qua 1 stream
                       ghi ra byte dữ liệu lưu trữ xuống tập tin

- Class ObjectOutputStream : hỗ trợ xuất ra 1 đối tượng
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class ex5_5 {
    public static void main(String[] args) {
        String s = "Thic nhat may a hacker ahiii !";

        try {
            FileOutputStream out = new FileOutputStream("out.txt");
            byte arr[] = s.getBytes();
            // Write byte array to the file
            out.write(arr);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
