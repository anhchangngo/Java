public class we17 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide four command-line arguments: x1, y1, x2, y2");
            return;
        }

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);

        System.out.println("Euclidean distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + "): " + distance);
    }

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }
}
