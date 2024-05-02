import java.util.Scanner;

public class hw5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your integer : ");
        int n = sc.nextInt();
        if(n >= 0 && n <= 9) {
            System.out.println("Fail");
        }
        else if(n >= 10 && n <= 12) {
            System.out.println("Average");
        }
        else if(n >= 13 && n <= 14) {
            System.out.println("Above Average");
        }
        else if(n >= 15 && n <= 16) {
            System.out.println("Good");
        }
        else if(n >= 17 && n <= 18) {
            System.out.println("Excellent");
        }
        else if(n >= 19 && n <= 20) {
            System.out.println("Excellent");
        }
        sc.close();
    }
}
