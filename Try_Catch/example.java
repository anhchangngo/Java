import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("Enter the number");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("The number is " + n);
    }
    
}
