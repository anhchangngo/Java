// f(x) = a(x^n) + b(x^m) + c

import java.util.Scanner;
import java.util.Random;

public class hw12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a (even number) : ");
        int a = sc.nextInt();
        if(a % 2 != 0) {
            System.out.println("Please input a must be even");
            return;
        }
        
        System.out.print("Input b (odd number) : ");
        int b = sc.nextInt();
        if(b % 2 == 0) {
            System.out.println("Please input a must be odd");
            return;
        }

        Random rand = new Random();
        double c = rand.nextDouble(0, 1000);
        System.out.println("Random c from 0 to 1000 : " + c);

        System.out.print("Input the number of n , m and x: ");
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double x = sc.nextDouble();

        double f = a * Math.pow(x, n) + b * Math.pow(x, m) + c;
        System.out.println("The value of function : " + f);

        sc.close();
    }
}
