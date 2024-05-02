// Tự tạo ngoại lệ trong java

import java.io.FileNotFoundException;
import java.io.FileReader;

class TenTrongKhongException extends RuntimeException {
    public TenTrongKhongException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String name = null;
        doDaiString(name);
        docFile("codethu.txt");
    }

    public static void docFile(String tenFile) throws FileNotFoundException {
        FileReader reader = new FileReader(tenFile);
    }

    public static void doDaiString(String chuoi) 
    throws TenTrongKhongException, NullPointerException {
        if (chuoi == null) {
            // throw new NullPointerException("Chuoi khong duoc null");
            throw new TenTrongKhongException("Chuoi khong duoc null");
        }
        System.out.println("Do dai chuoi : " + chuoi.length());
    }
}
