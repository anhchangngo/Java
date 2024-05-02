public class Quadratic {
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double delta = a*a - 4.0 * b;
        double sqroot = Math.sqrt(delta);

        double root1 = (-b + sqroot) / 2;
        double root2 = (-b - sqroot) / 2;

        System.out.println(root1);
        System.out.println(root2);
    }
}

// Use : java Quadratic 5.0 3.0
// Output :  0.30277563773199456
//           -3.302775637731995