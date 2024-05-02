public class ce39 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        
        x = x % (2 * Math.PI);

        // compute the Taylor series approximation
        double term = 1.0;      
        double sum  = 0.0;      
        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        System.out.println(sum);
    }
}
