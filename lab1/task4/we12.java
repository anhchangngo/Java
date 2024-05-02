import java.util.Scanner;

public class we12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first parameter:");
        int param1 = scanner.nextInt();

        System.out.println("Enter the second parameter:");
        int param2 = scanner.nextInt();

        System.out.println("Enter the third parameter:");
        int param3 = scanner.nextInt();

        boolean allEqual = (param1 == param2) && (param2 == param3);

        System.out.println("All three parameters are equal: " + allEqual);
    }
}
