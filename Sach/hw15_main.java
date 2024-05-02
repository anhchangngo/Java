/* 
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class hw15_main {

    public static void printFile(hw15_student[] stds, String filename) throws FileNotFoundException, IOException {
        try (PrintWriter pw = new PrintWriter(filename)) {
            pw.printf("%-15s%-17s%-17s%-15s%-15s%-17s%-15s%-15s\n", "ID course", "Name course", "ID lecturer",
            "Name lecturer", "ID student", "Name student", "Midterm score", "Final score");

            for (hw15_student st : stds) {
                for (hw15_lecturer course : st.getCourses()) {
                    pw.printf("%-15s%-17s%-17s%-15s%-15s%-17s%-15s%-15s\n", course.getIDcs(), course.getNamecs(),
                            course.getIDlc(), course.getNamelc(), st.getIDst(), st.getNamest(), course.getMid(), course.getFinal());
                }
            }

        pw.println("\nGrade Passing Student");
        for (hw15_student st : stds) {
            if (st.isPassing()) {
        pw.println(st.getNamest());
    }
}

        pw.println("\nRetake student");
        for (hw15_student st : stds) {
            if (!st.isPassing()) {
        pw.println(st.getNamest());
    }
}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static hw15_student[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        hw15_student[] students = new hw15_student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nThe Student " + (i + 1));
            System.out.print("Enter Student ID : ");
            String idst = sc.next();
            sc.nextLine();
            System.out.print("Enter Student Name : ");
            String namest = sc.nextLine();

            students[i] = new hw15_student("", "", 0.0, 0.0, "", "", idst, namest);

            System.out.print("Enter the number of courses for student " + (i + 1) + ": ");
            int numCourses = sc.nextInt();

            for (int j = 0; j < numCourses; j++) {
                System.out.print("Enter Course ID : ");
                String idcs = sc.next();
                sc.nextLine();
                System.out.print("Enter Course Name : ");
                String namecs = sc.nextLine();
                System.out.print("Enter Lecturer ID : ");
                String idlc = sc.next();
                sc.nextLine();
                System.out.print("Enter Lecturer Name : ");
                String namelc = sc.nextLine();
                System.out.print("Enter Midterm score : ");
                Double mid = sc.nextDouble();
                System.out.print("Enter Final score : ");
                Double fin = sc.nextDouble();

                hw15_lecturer course = new hw15_lecturer(idcs, namecs, mid, fin, idlc, namelc);
                students[i].addCourse(course);
            }
        }

        sc.close();
        return students;
    }

    public static void print(hw15_student[] stds) {
        System.out.printf("%-15s%-17s%-17s%-15s%-15s%-17s%-15s%-15s\n", "ID course", "Name course", "ID lecturer",
                "Name lecturer", "ID student", "Name student", "Midterm score", "Final score");
    
        for (hw15_student st : stds) {
            for (hw15_lecturer course : st.getCourses()) {
                System.out.printf("%-15s%-17s%-17s%-15s%-15s%-17s%-15s%-15s\n", course.getIDcs(), course.getNamecs(),
                        course.getIDlc(), course.getNamelc(), st.getIDst(), st.getNamest(), course.getMid(), course.getFinal());
            }
        }
    
        System.out.println("\nGrade Passing Student");
        for (hw15_student st : stds) {
            if (st.isPassing()) {
                System.out.println(st.getNamest());
            }
        }
    
        System.out.println("\nRetake student");
        for (hw15_student st : stds) {
            if (!st.isPassing()) {
                System.out.println(st.getNamest());
            }
        }
    }
    
    public static void main(String[] args) {
        hw15_student[] stds = input();
        try {
            printFile(stds, "student.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        print(stds);
    }
}

*/

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class hw15_main {
    public static void printFile(hw15_student[] stds, String fileName) throws IOException {
        try {
            PrintWriter pw = new PrintWriter(fileName);
            pw.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ID Course", "Name Course", 
                      "ID Lecturer", "Name Lecturer", "ID Student", "Name Student", "Midterm score", "Final score");
            for(hw15_student std : stds) {
                for(hw15_lecturer cr : std.getCourse()) {
                    pw.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", cr.getIDc(), cr.getNamec(), 
                              cr.getIDl(), cr.getNamel(), std.getIDs(), std.getNames(), cr.getMid(), cr.getFin());
                }
            }

            pw.println("Grade Passing Student");
            for(hw15_student std : stds) {
                if(std.isPassing()) {
                pw.println(std.getNames());
            }
        }

            pw.println("Retake Student");
            for(hw15_student std : stds) {
                if(!std.isPassing()) {
                pw.println(std.getNames());
            }
        }
        System.out.println("Data is written " + fileName);
        pw.close();
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static hw15_student[] input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Student : ");
        int n = sc.nextInt();
        hw15_student[] std = new hw15_student[n];

        for(int i = 0; i < n; i ++) {
            System.out.println("\nInformation student " + (i + 1));
            System.out.print("Enter ID Student : ");
            String ids = sc.next();
            sc.nextLine();
            System.out.print("Enter Name Student : ");
            String ns= sc.nextLine();
        
            std[i] = new hw15_student(0, "", 0.0, 0.0, "", "", ids, ns);

            System.out.print("\nEnter the number course : ");
            int n1 = sc.nextInt();
            for(int j = 0; j < n1; j ++) {
                System.out.println("\nInformation course " + (j + 1));
                System.out.print("Enter ID Course : ");
                int idc = sc.nextInt();
                System.out.print("Enter Name Course : ");
                String nc = sc.next();
                System.out.print("Enter ID Lecturer : ");
                String idl = sc.next();
                sc.nextLine();
                System.out.print("Enter Name Lecturer : ");
                String nl = sc.nextLine();
                System.out.print("Enter Midterm Score : ");
                double ms = sc.nextDouble();
                System.out.print("Enter Final Score : ");
                double fs = sc.nextDouble();

                hw15_lecturer cr = new hw15_lecturer(idc, nc, ms, fs, idl, nl);
                std[i].addCourse(cr);
            }
        }
        sc.close();
        return std;
    }

    public static void main(String[] args) {
        hw15_student[] std = input();
        try {
            printFile(std, "student2.txt");
    }   catch(Exception e) {
        e.printStackTrace();
    }
}
}