/*
Lớp BufferedReader cung cấp các phương thức đọc dữ liệu theo hàng, cho phép đọc dữ liệu từ FileReader một cách hiệu quả hơn
Sử dụng BufferedReader có thể tăng hiệu suất đọc dữ liệu từ tệp tin, đặc biệt khi đọc dữ liệu có kích thước lớn.
*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ex5_10 {
    public static void main(String[] args) {
        char[] arr = new char[100];
        try {
            // Create a reader
            FileReader f = new FileReader("/Users/macbookair/Desktop/test.txt");
            // Create a BufferedReader
            BufferedReader bf = new BufferedReader(f);
            // Read character from buffer reader
            bf.read(arr);
            System.out.println(arr);
            f.close();
            bf.close();
        }   catch(IOException e) {
            e.printStackTrace();
        }
    }
}