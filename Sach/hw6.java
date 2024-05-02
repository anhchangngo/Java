// (a1, b1)   (a2, b2)
//      d = sqrt((a2 - a1)^2 + (b2 - b1)^2)

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 2 coordiantes a1, b1 : ");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        System.out.print("Input 2 coordinates a2, b2 : ");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();

        double s1 = Math.pow((a2 - a1), 2);
        double s2 = Math.pow((b2 - b1), 2);
        double d = Math.sqrt(s1 + s2);
        System.out.println("The distance of two given point (" + a1 + "," + b1 + ") and (" + a2 + "," + b2 + ") : " + d);

        sc.close();
    }
}
