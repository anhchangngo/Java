import java.io.*;
import java.util.*;

class Person {
    String id;
    String name;

    Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Course {
    String id;
    String name;

    Course(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Lecturer extends Person {
    Lecturer(String id, String name) {
        super(id, name);
    }
}

class Student extends Person {
    double midtermScore;
    double finalScore;

    Student(String id, String name, double midtermScore, double finalScore) {
        super(id, name);
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    static Student fromString(String dataStr) {
        String[] data = dataStr.split(",");
        return new Student(data[0], data[1], Double.parseDouble(data[2]), Double.parseDouble(data[3]));
    }

    double averageScore() {
        return (this.midtermScore + this.finalScore) / 2;
    }

    boolean hasPassed() {
        return this.averageScore() > 10 && this.midtermScore > 7;
    }
}

public class Main {
    static void writeDataToFile(String filename, String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(data);
        writer.close();
    }

    static String readDataFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String data = reader.readLine();
        reader.close();
        return data;
    }

    public static void main(String[] args) throws IOException {
        // Initialize lists
        List<Course> courseList = new ArrayList<>();
        List<Lecturer> lecturerList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        // Input data
        // For simplicity, I'll just add some dummy data here
        courseList.add(new Course("1", "Math"));
        lecturerList.add(new Lecturer("1", "John"));
        studentList.add(new Student("1", "Alice", 8.5, 12.5));

        // Write data to file
        StringBuilder data = new StringBuilder();
        for (Course course : courseList) {
            data.append(course.id).append(",").append(course.name).append("\n");
        }
        for (Lecturer lecturer : lecturerList) {
            data.append(lecturer.id).append(",").append(lecturer.name).append("\n");
        }
        for (Student student : studentList) {
            data.append(student.id).append(",").append(student.name).append(",").append(student.midtermScore).append(",").append(student.finalScore).append("\n");
        }
        writeDataToFile("data.txt", data.toString());

        // Read data from file
        String dataStr = readDataFromFile("data.txt");
        String[] dataLines = dataStr.split("\n");
        for (String line : dataLines) {
            String[] dataParts = line.split(",");
            if (dataParts.length == 4) {  // This is a student
                studentList.add(Student.fromString(line));
            }
        }

        // Check if students have passed
        for (Student student : studentList) {
            if (student.hasPassed()) {
                System.out.println(student.id + " " + student.name + ": Pass");
            }
        }
    }
}