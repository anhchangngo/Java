import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class hw16_main {
    public static void main(String[] args) {
        // Create Course
        hw16_Course oop = new hw16_Course("OOP");
        hw16_Course web = new hw16_Course("WEB");
        hw16_Course ip  = new hw16_Course("IP");

        // Add course an array
        hw16_Course[] c = {oop, web, ip};

        try {
            printCourse(c, "course_name.txt");
        }   catch(Exception e) {
            e.printStackTrace();
        }

        input(c);

        try {
            printFile(c, "hw16.txt");
        }   catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void printCourse(hw16_Course[] crs, String filename) throws IOException {
        try {
            PrintWriter pw = new PrintWriter(filename);
            pw.println("Course Name");
            for(hw16_Course cr : crs) {
                pw.println(cr.getName());
            }
            pw.close();
        }   catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void printFile(hw16_Course[] crs, String filename) throws IOException {
        try {
            PrintWriter pw = new PrintWriter(filename);
            for(hw16_Course cr : crs) {
            pw.println("\nCourse Name " + cr.getName());

            pw.println("\nList Lecturer");
            pw.printf("%-15s%-15s\n","Lecturer ID", "Lecturer Name");
            for(hw16_Lecturer lc : cr.getLec()) {
                pw.printf("%-15s%-15s\n", lc.getID(), lc.getName());
            }

            pw.println("\nList Student");
            pw.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Student ID", "Student Name", "Attendance", "Midterm", "Final", "Final Course");
            for(hw16_Student std : cr.getStd()) {
                pw.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", std.getID(), std.getName(), std.getAttend(), std.getMid(), std.getFin(), std.Final());
            }

            pw.println("\nAverage Students");
            pw.printf("%-15s%-15s\n", "Student ID", "Student Name");
            for(hw16_Student std : cr.getStd()) {
                if(std.getAttend() <= 6 && std.Final() < 10) {
                    pw.printf("%-15s%-15s\n", std.getID(), std.getName());
                }
            }

            pw.println("\nGood Student");
            pw.printf("%-15s%-15s\n", "Student ID", "Student Name");
            for(hw16_Student std : cr.getStd()) {
                if(std.getAttend() >= 10 && std.getMid() >= 15 && std.getFin() >= 16 && std.Final() >= 13) {
                    pw.printf("%-15s%-15s\n", std.getID(), std.getName());
                }
            }
        }
        pw.close();
        System.out.println("System Data is written " + filename);
    }   catch (Exception e) {
        e.printStackTrace();
    }
    }

    public static void input(hw16_Course[] crs) {
        Scanner sc = new Scanner(System.in);
        for(hw16_Course cr : crs) {
        System.out.println("\nCourse Name : " + cr.getName());

        System.out.println("\nList lecturer");
        System.out.print("Enter the number of lecturer : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i ++) {
            System.out.println("Information lecturer " + (i + 1));
            System.out.print("Enter Lecturer ID : ");
            String lid = sc.next();
            sc.nextLine();
            System.out.print("Enter Lecturer Name : ");
            String ln = sc.nextLine();

            hw16_Lecturer lec = new hw16_Lecturer(lid, ln);
            cr.addLec(lec);
        }

        System.out.println("\nList student");
        System.out.print("Enter the number of students : ");
        int n1 = sc.nextInt();
        for(int j = 0; j < n1; j ++) {
            System.out.println("\nInformation student " + (j + 1));
            System.out.print("Enter Student ID : ");
            String sid = sc.next();
            sc.nextLine();
            System.out.print("Enter Student name : ");
            String sn = sc.nextLine();
            System.out.print("Enter Attend mark : ");
            Double am = sc.nextDouble();
            System.out.print("Enter Midterm mark : ");
            Double mm = sc.nextDouble();
            System.out.print("Enter Final mark : ");
            Double fm = sc.nextDouble();

            hw16_Student std = new hw16_Student(sid, sn, am, mm, fm);
            cr.addStd(std);
        }
    }
    sc.close();
}
}