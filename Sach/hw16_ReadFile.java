/*
import java.io.File;
import java.nio.file.Files;
import java.util.List;
*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class hw16_ReadFile {
    public static void main(String[] args) {
        /*
        File f = new File("/Users/macbookair/Desktop/Learn Code/Learn_Java/Sach/hw16.txt");
        try {
            List<String> allText = Files.readAllLines(f.toPath());
            for(String line : allText) {
                System.out.println(line);
            }
        }   catch (Exception e) {
            e.printStackTrace();
        }
        */

        try {
            // Create FileReader
            FileReader f = new FileReader("/Users/macbookair/Desktop/Learn Code/Learn_Java/Sach/hw16.txt");
            // Create BufferedReader
            BufferedReader b = new BufferedReader(f);
            // Read text in file
            String s = b.readLine();
            while(s != null) {
                System.out.println(s);
                s = b.readLine();
            }
            b.close();
            f.close();
        }   catch(IOException e) {
            e.printStackTrace();
        }   
    }
}

