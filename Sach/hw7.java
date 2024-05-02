import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements : ");
        int n = sc.nextInt();

        double[] num = new double[n];
        for (int i = 0; i < n; i ++) {
            System.out.print("Input number " + (i + 1) + " : ");
            num[i] = sc.nextDouble();
        }

        // Calculate average 
        double avg = 0;
        for (double m : num) {
            avg += m;
        }
        avg = avg / n;
        System.out.println("The average value : " + avg);

        // Differences from the average
        double s = 0;    // square of their differences from the average
        for (double m : num) {
            s += Math.pow((m - avg), 2);
        }

        double sd = Math.sqrt(s / (n - 1));
        System.out.println("The sample standard deviation : " + sd);

        sc.close();
    }
}
