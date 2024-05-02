public class VectorTestDrive {
    public static void main(String[] args){
        Vector X = new Vector(18, 20);
        Vector Y = new Vector(2, 4);

        System.out.println("Information of vector x : " + "(" + X.getX() + " " + X.getY() + ")");
        System.out.println("Information of vector y : " + "(" + Y.getX() + " " + Y.getY() + ")");

        Vector plus = X.add(Y);
        System.out.println("Sum : x + y = " + "(" + plus.getX() + " " + plus.getY() + ")");

        Vector minus = X.subtract(Y);
        System.out.println("Subtract : x - y = " + "(" + minus.getX() + " " + minus.getY() + ")");

        double product = X.multiple(Y);
        System.out.println("Multiple : x * y = " + product);
}
}

