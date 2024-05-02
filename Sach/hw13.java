import java.util.Scanner;

public class hw13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of vector : ");
        int n = sc.nextInt();

        double[] vecA  = new double[n];
        System.out.println("Enter value elements of vector a");
        for(int i = 0; i < n; i ++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            vecA[i] = sc.nextDouble();
        }

        double[] vecB = new double[n];
        System.out.println("Enter value elements of vector b");
        for(int i = 0; i < n; i ++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            vecB[i] = sc.nextDouble();
        }

        // Calculate angle
        double magnetidueA = 0;
        double magnetidueB = 0;
        double dotProduct = 0;
        for(int i = 0; i < n; i ++) {
            magnetidueA += Math.pow(vecA[i], 2);
            magnetidueB += Math.pow(vecB[i], 2);
            dotProduct  += vecA[i] * vecB[i];
        }
        magnetidueA = Math.sqrt(magnetidueA);
        magnetidueB = Math.sqrt(magnetidueB);

        double cosTheta = dotProduct / (magnetidueA * magnetidueB);
        double angleInRadians = Math.acos(cosTheta);
        double angleInDegrees = Math.toDegrees(angleInRadians);

        System.out.println("The angle in Radians between vector a and b " + angleInRadians + " radians");
        System.out.println("The angle in Degrees between vector a and b " + angleInDegrees + " degrees");

        sc.close();
    }
}
