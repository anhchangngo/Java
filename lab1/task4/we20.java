public class we20 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide three command-line arguments: a, b, and c");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double s = (a + b + c) / 2; // Calculate the semi-perimeter

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
        System.out.println("The area of the triangle is: " + area);
    }
}
