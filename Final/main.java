import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    public static void writeToFile(student[] stds, String filename) throws IOException, FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(filename)) {
            pw.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-27s%-27s%-15s\n", "Course ID", "Course Name",
                    "Lecturer ID", "Lecturer Name", "Student ID", "Student Name", "Average Midterm Score", "Average Final Score", "Result");

            for (student std : stds) {
                pw.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-27s%-27s%-15s\n",
                        std.getIDcs(), std.getNamecs(), std.getIDlc(), std.getNamelc(), 
                        std.getIDstd(), std.getNamestd(), std.getMid_score(), std.getFinal_score(), std.getResult());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static student[] input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of Courses : ");
        int n1 = sc.nextInt();
        student[] std = new student[n1];

        for (int i = 0; i < n1; i++) {
            System.out.print("Input Course ID : ");
            String idcs = sc.next();
            System.out.print("Input Course Name : ");
            String csn = sc.next();
            System.out.print("Input Lecturer ID : ");
            String idlc = sc.next();
            System.out.print("Input Lecturer Name : ");
            String lcn = sc.next();
            System.out.print("Input Student ID : ");
            String idstd = sc.next();
            System.out.print("Input Student Name : ");
            String stdn = sc.next();
            System.out.print("Input Midterm Score : ");
            Double mid = sc.nextDouble();
            System.out.print("Input Final Score : ");
            Double fin = sc.nextDouble();

            std[i] = new student(idcs, csn, idlc, lcn, idstd, stdn, mid, fin);
        }
        sc.close();
        return std;
    }

    public static void print(student[] stds) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-27s%-27s%-15s\n", "Course ID", 
                                 "Course Name", "Lecturer ID", "lecturer Name", "Student ID", 
                                 "Student Name", "Average Midterm Score", "Average Final Score", "Result");

            for(student std : stds ) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-27s%-27s%-15s\n", std.getIDcs(), 
                                std.getNamecs(), std.getIDlc(), std.getNamelc(), std.getIDstd(), 
                                std.getNamestd(), std.getMid_score(), std.getFinal_score(), std.getResult());
            }

    }

    public static void main(String[] args) {
        student[] stds = input();
        try {
            writeToFile(stds, "student.txt");
            System.out.println("Success to write to file student.txt !");
        } catch (Exception e) {
            e.printStackTrace();
        }

        print(stds);
    }
}
