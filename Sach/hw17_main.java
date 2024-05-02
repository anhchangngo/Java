import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class hw17_main {

    public static void printFile(hw17_student[] stds, String filename) throws IOException {
        try {
            PrintWriter pw = new PrintWriter(filename);
            pw.printf("%-15s%-20s%-20s%-15s\n", "Full Name", "Date of Bith", "Math Course Name", "Average Mark");
            for(hw17_student std : stds) {
                pw.printf("%-15s%-20s%-20s%-15s\n", std.getName(), std.getDate(), std.getCourse(), std.AvgMark());
            }

            pw.println("\nThe very good math student");
            for(hw17_student std : stds) {
                if(std.AvgMark() >= 15) {
                    pw.println(std.getName());
                }
            }
            pw.close();
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static hw17_student[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student : ");
        int n = sc.nextInt();

        hw17_student[] std = new hw17_student[n];
        for(int i = 0; i < n; i ++) {
            System.out.println("Information student " + (i + 1));
            sc.nextLine();
            System.out.print("Enter the Name : ");
            String na = sc.nextLine();
            System.out.print("Enter date of the bith (month/date/year) : ");
            String d = sc.next();

            List<String> courses = new ArrayList<>();
            List<Double> marks = new ArrayList<>();

            System.out.println("The math course name and corresponding marks in the last 2 years");
            for(int j = 0; j < 2; j ++) {
            System.out.print("Enter the math course " + (j + 1) + "name : ");
            String cn = sc.next();
            courses.add(cn);
            System.out.print("Enter mark " + (j + 1) + "year : ");
            double m = sc.nextDouble();
            marks.add(m);
        }
        std[i] = new hw17_student(na, d, courses, marks);
    }
    sc.close();
    return std;
}
    public static void main(String[] args) {
        hw17_student[] stds = input();
        try {
            printFile(stds, "hw17.txt");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}