public class we3 {
    
    public static void main(String[] args) {

    if (args.length != 3) {
        System.out.println("Please provide three double command-line arguments for Y, I, and Q.");
        return;
    }


    double Y = Double.parseDouble(args[0]);
    double I = Double.parseDouble(args[1]);
    double Q = Double.parseDouble(args[2]);


    if (Y < 0 || Y > 1 || I < -0.5957 || I > 0.5957 || Q < -0.5226 || Q > 0.5226) {
        System.out.println("Invalid input. Please ensure Y is between 0 and 1, I is between -0.5957 and 0.5957, and Q is between -0.5226 and 0.5226.");
        return;
    }


    Y *= 255.0;
    I *= 255.0;
    Q *= 255.0;


    int R = (int) (Y + 0.956 * I + 0.621 * Q);
    int G = (int) (Y - 0.272 * I - 0.647 * Q);
    int B = (int) (Y - 1.106 * I + 1.703 * Q);


    if (R < 0) R = 0;
    if (R > 255) R = 255;
    if (G < 0) G = 0;
    if (G > 255) G = 255;
    if (B < 0) B = 0;
    if (B > 255) B = 255;


    System.out.println("R: " + R);
    System.out.println("G: " + G);
    System.out.println("B: " + B);
}
}
