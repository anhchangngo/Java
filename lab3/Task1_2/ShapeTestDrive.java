import java.text.DecimalFormat;
import java.util.Scanner;

public class ShapeTestDrive {
	public static void main(String[] args){
		DecimalFormat df = new DecimalFormat(".##");
		double x, y, r, h;
		int n;
		Scanner sc = new Scanner(System.in);
		Shape []arr = new Shape[1000];
		System.out.print("Enter number of objects: ");
        n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n*3; i = i + 3){
        	System.out.println("Enter details for object : " + (count+1));
        	System.out.println("Enter x and y: ");
        	x = sc.nextDouble();
        	y = sc.nextDouble();
        	arr[i] = new Point(x, y);
        	System.out.print("Enter r: ");
        	r = sc.nextDouble();
        	arr[i + 1] = new Circle(x, y, r);
        	System.out.print("Enter h: ");
        	h = sc.nextDouble();
        	arr[i + 2] = new Cylinder(x, y, r, h);
            count ++;

            sc.close();
        }
        count = 0;
        for (int i = 0; i < n*3; i = i + 3) {
            System.out.println("--------------------------");
            System.out.println("Object : " + (count + 1));
            System.out.println("--------------------------");
            System.out.println("Accessing point arr");
            System.out.println("Name: " + arr[i].getName());
            System.out.println("Area: " + arr[i].calArea());
            System.out.println("Volume: " + arr[i].calVolume());
            System.out.println("--------------------------");
            System.out.println("Accessing circle arr");
            System.out.println("Name: " + arr[i+1].getName());
            System.out.println("Area: " + df.format(arr[i+1].calArea()));
            System.out.println("Volume: " + arr[i+1].calVolume());
            System.out.println("--------------------------");
            System.out.println("Accessing cylinder arr");
            System.out.println("Name: " + arr[i+2].getName());
            System.out.println("Area: " + df.format(arr[i+2].calArea()));
            System.out.println("Volume: " + df.format(arr[i+2].calVolume()));
            count++;
        }
	}	
}

