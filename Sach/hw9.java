import java.util.Scanner;
import java.util.Arrays;

public class hw9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many course you want to add : ");
        int n = sc.nextInt();

        sc.nextLine();

        String[] str = new String[n];
        for(int i = 0; i < n; i ++) {
        System.out.print("Input a String " + (i + 1) + " : ");
        str[i] = sc.nextLine();
        }

        // find the strings "OOP course
        boolean c = Arrays.asList(str).contains("OOP course");

        if(c) {  // true
            System.out.println("The string has 'OOP course'");
        }
        else {
            System.out.println("The string DOES NOT 'OOP course'");
        }

        sc.close();
    }
}

/*
import java.util.Scanner;

public class hw9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String: ");
        String inputString = sc.nextLine();

        // Find the string "OOP course"
        boolean containsOOPCourse = inputString.contains("OOP course");

        // Display the result
        if (containsOOPCourse) {
            System.out.println("The string contains 'OOP course'.");
        } else {
            System.out.println("The string does not contain 'OOP course'.");
        }

        sc.close();
    }
}
*/
