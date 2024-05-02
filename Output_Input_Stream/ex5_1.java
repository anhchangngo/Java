/*
- Class OutputStream : class hỗ trợ xuất dữ liệu thông qua 1 stream
                       ghi ra byte dữ liệu lưu trữ xuống tập tin

- Class ObjectOutputStream : hỗ trợ xuất ra 1 đối tượng

- InputStream : a built-in abstract class in the java.io package that represent an input data stream of bytes
                useful for handling raw data sources like binary files, console input, or video streams.
*/

import java.io.FileInputStream;
import java.io.IOException;

public class ex5_1 {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream object
            FileInputStream in = new FileInputStream("/Users/macbookair/Desktop/test.txt");
            // Read one byte
            int b = in.read();
            // Loop while there are more bytes to read
            while(b != -1) {
                // Print the byte in character form
                System.out.print((char) b); 
                b = in.read();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
