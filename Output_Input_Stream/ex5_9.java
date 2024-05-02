/*
- Character streams : allow reading and writing data in character
                      A character can take more than 1 byte to represent

- Reader : built-in abstract class in java.io package that is designed to 
           read character streams from different data source
*/

import java.io.FileReader;
import java.io.IOException;

public class ex5_9 {
    public static void main(String[] args) {
        char[] arr = new char[100];
        try {
            // Create a reader 
            FileReader fr = new FileReader("/Users/macbookair/Desktop/test.txt");
            // read character and store them in array
            fr.read(arr);
            System.out.print(arr);
            fr.close();
        }   catch(IOException e) {
            e.printStackTrace();
        }
    }
}
