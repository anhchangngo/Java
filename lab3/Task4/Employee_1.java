/* 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Employee_1 {
    public static void writeToFile(Employee[] employees, String filename) throws FileNotFoundException, IOException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.printf("%-15s%-25s%-15s%-15s\n", "ID", "Full name", "Department", "Income");

            // Write data
            for (Employee employee : employees) {
                writer.printf("%-15s%-25s%-15s%.2f\n", employee.getID(), employee.getFullname(),
                        employee.getDepartment(), employee.Income());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Employee[] userinputInfos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number of employees: ");
        int numOfEmployees = scanner.nextInt();

        Employee[] employees = new Employee[numOfEmployees];

        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("Information of Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            String id = scanner.next();
            System.out.print("Employee full name: ");
            String fullname = scanner.next();
            System.out.print("Employee department: ");
            String department = scanner.next();
            System.out.print("Employee basic salary: ");
            double basicS = scanner.nextDouble();
            System.out.print("Employee extra salary: ");
            double extraS = scanner.nextDouble();

            employees[i] = new Employee(id, fullname, department, basicS, extraS);
        }
        scanner.close();
        return employees;
    }

    public static void main(String[] args) {
        // Simulate employee input
        Employee[] employees = userinputInfos();
        try {
            writeToFile(employees, "employees.txt");
            System.out.println("Employee data has been written to employees.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print out
        System.out.printf("%-15s%-25s%-15s%-15s\n", "ID", "Full name", "Department", "Income");
        for (Employee employee : employees) {
            System.out.printf("%-15s%-25s%-15s%.2f\n", employee.getID(), employee.getFullname(),
                    employee.getDepartment(), employee.Income());
        }
    }
}
*/


import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Employee_1 {

    public static void writeToFile(Employee[] employees, String filename) throws FileNotFoundException, IOException {
    try (PrintWriter pw = new PrintWriter(filename)) {
    pw.printf("%-15s%-25s%-15s%-15s\n", "ID", "FullName", "Department", "Income");

    for(Employee e : employees) {
        pw.printf("%-15s%-25s%-15s%.2f\n",e.getID(), e.getfullName(), e.getDepartment(), e.Income());

    }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public static Employee[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of students : ");
        int n = sc.nextInt();

        Employee[] e = new Employee[n];
        for(int i = 0; i < n; i ++) {
            System.out.print("Input ID : ");
            String id = sc.next();
            System.out.print("Input FULL NAME : ");
            String full_name = sc.next();
            System.out.print("Input DEPARTMENT : ");
            String department = sc.next();
            System.out.print("Input BASE SALARY : ");
            double base_salary = sc.nextDouble();
            System.out.print("Input EXTRA SALARY : ");
            double extra_salary = sc.nextDouble();

            e[i] = new Employee(id, full_name, department, base_salary, extra_salary);
        }
        sc.close();
        return e;
    }

    public static void main (String[] args) {
        Employee[] es = input();

        try {
            writeToFile(es, "employees.txt");
            System.out.println("Success to print in employees.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        System.out.printf("%-15s%-25s%-15s%-15s\n", "ID", "FullName", "Department", "Income");
        for (Employee em : es) {
            System.out.printf("%-15s%-25s%-15s%.2f\n", em.getID(), em.getfullName(), em.getDepartment(), em.Income());
        }
    }
}
}