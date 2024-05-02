public class we4 {
    public static void main(String[] args) {
        // Check if four command-line arguments are provided
        if (args.length != 4) {
            System.out.println("Please provide four double command-line arguments for C, M, Y, and K.");
            return;
        }

        double C = Double.parseDouble(args[0]);
        double M = Double.parseDouble(args[1]);
        double Y = Double.parseDouble(args[2]);
        double K = Double.parseDouble(args[3]);

        if (C < 0 || C > 1 || M < 0 || M > 1 || Y < 0 || Y > 1 || K < 0 || K > 1) {
            System.out.println("Invalid input. Please ensure C, M, Y, and K are between 0 and 1.");
            return;
        }


        int R = (int) (255 * (1 - C) * (1 - K));
        int G = (int) (255 * (1 - M) * (1 - K));
        int B = (int) (255 * (1 - Y) * (1 - K));


        System.out.println("R: " + R);
        System.out.println("G: " + G);
        System.out.println("B: " + B);
    } 
}
