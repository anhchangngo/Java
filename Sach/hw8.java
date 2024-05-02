import java.util.Scanner;

public class hw8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value of n integer number : ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i ++) {
            sum += Math.pow(i, 2);
        }

        System.out.println("The sum of the square of " + n + " integer numbers : " + sum);

        sc.close();
    }
}
