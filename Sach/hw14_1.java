import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class hw14_1 {

    public static void printFile(hw14[] eps, String filename) {
        try(PrintWriter pw = new PrintWriter(filename)) {
            pw.printf("%-15s%-25s%-25s%-15s\n", "Employee ID", 
                              "Employee full name", "Employee department", "Income");
            for(hw14 ep : eps) {
                pw.printf("%-15s%-25s%-25s%-15s\n", ep.getID(), ep.getName(), ep.getDepartment(), ep.getIncome());
            }
            pw.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static hw14[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees : ");
        int n = sc.nextInt();

        hw14[] ep = new hw14[n];
        for(int i = 0; i < n; i ++) {
            System.out.println("Information employee " + (i + 1));
            System.out.print("Enter ID : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Full Name : ");
            String name = sc.nextLine();
            System.out.print("Enter Department : ");
            String dp = sc.nextLine();
            System.out.print("Enter Basic Salary : ");
            Double bs = sc.nextDouble();
            System.out.print("Enter Extra Salary : ");
            Double es = sc.nextDouble();

            ep[i] = new hw14(id, name, dp,  bs, es);
        }
        sc.close();
        return ep;
    }
    
    public static void print(hw14[] eps) {
        System.out.printf("%-15s%-25s%-25s%-15s\n", "Employee ID", 
                          "Employee full name", "Employee department", "Income");
            for(hw14 ep : eps) {
                System.out.printf("%-15s%-25s%-25s%-15s\n", ep.getID(), 
                                  ep.getName(), ep.getDepartment(), ep.getIncome());
            }
    }
        public static void main(String[] args) {
            hw14[] eps = input();
            try {
                printFile(eps, "employee.txt");
            } catch (Exception e) {
                e.printStackTrace();
            }
            print(eps);
        }
    }