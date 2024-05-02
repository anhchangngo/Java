/*
- Writer is a built-in abstract class in the java.io package that is designed to 
Write character streams to different destination such as memory stream, file, pipe or string
*/

import java.io.FileWriter;
import java.io.IOException;

public class ex5_12 {
    public static void main(String[] args) {
        String s = "Welcome to Bounty Boy. Here we are hacker !";
        try {
            // Create a Writer
            FileWriter fw = new FileWriter("ex5_12.txt");
            // store a string to the file
            fw.write(s);
            // close the writer
            fw.close();
        }   catch(IOException e){
            e.printStackTrace();
        }
    }
}