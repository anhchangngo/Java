import java.util.Scanner;

public class hw10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of integer number : ");
        int n = sc.nextInt();

        int[] num = new int[n];
        for(int i = 0; i < n; i ++) {
            System.out.print("Input the number " + (i + 1) + " : ");
            num[i] = sc.nextInt();
        }

        // Average 
        double avg = 0;
        for(int m : num) {
            avg += m;
        }
        avg = avg / n;
        System.out.println("The average : " + avg);

        // Find the numbers that are greater than the average
        for(int k : num) {
            if(k > avg) {
                System.out.println("The number > average : " + k);
            }
        }

        sc.close();
    }
}
