/*
nextBoolean()	    Reads a boolean value from the user
nextByte()	        Reads a byte value from the user
nextDouble()	    Reads a double value from the user
nextFloat()	        Reads a float value from the user
nextInt()	        Reads a int value from the user
nextLine()	        Reads a String value from the user
nextLong()	        Reads a long value from the user
nextShort()	        Reads a short value from the user
*/

/*
import java.util.Scanner;

public class vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of dimensions : ");
        int n = sc.nextInt();

        double[] vec1 = input(n, "1");
        double[] vec2 = input(n, "2");

        double angle = calAngle(vec1, vec2);
        System.out.println("The angle in degrees : " + angle + " degrees");
    }

    public static double[] input(int dimension, String numVector) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Values of the vectors " + numVector);
        double[] vector = new double[dimension];  // kích thước = dimension
        for(int i = 0; i < dimension; i ++) {
            System.out.print("Input the values of dimension " + (i + 1) + " : ");
                vector[i] = sc.nextDouble();
        }
        return vector;
    }

    public static double calAngle(double[] vector1, double[] vector2) {
        double dotProduct = 0;
        double magnetidue1 = 0;
        double magnetidue2 = 0;

        for(int i = 0; i < vector1.length; i ++) {
            dotProduct += vector1[i] * vector2[i];
            magnetidue1 += Math.pow(vector1[i], 2);
            magnetidue2 += Math.pow(vector2[i], 2);
        }
        magnetidue1 = Math.sqrt(magnetidue1);
        magnetidue2 = Math.sqrt(magnetidue2);

        double cosTheta = dotProduct / (magnetidue1 * magnetidue2);
        double angleInRadians = Math.acos(cosTheta);
        double angleInDegrees = Math.toDegrees(angleInRadians);

        return angleInDegrees;

    }
}
*/

import java.util.Scanner;

public class vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of dimensions of vectors : ");
        int n = sc.nextInt();

        double vecA[] = new double[n]; 
        System.out.println("The values of each dimension of the vectors a");
        for(int i = 0; i < n; i ++) {
            System.out.print("Input the values dimension " + (i + 1) + " : ");
            vecA[i] = sc.nextDouble();
        }

        double vecB[] = new double[n];
        System.out.println("The values of each dimension of the vectors b");
        for(int j = 0; j < n; j ++) {
            System.out.print("Input the values dimension " + (j + 1) + " : ");
            vecB[j] = sc.nextDouble();
        }
        sc.close();

        // Calculate Angle
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
        double AngleInRadians = Math.acos(cosTheta);
        double AngleInDegrees = Math.toDegrees(AngleInRadians);

        System.out.println("Angle in degrees : " + AngleInDegrees);
    }
}