public class IntOps {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[0]);
        int sum = a + b;
        int product = a * b;
        double quot = a / b;
        double rem = a % b;

        System.out.println("a " + "b " + " = " + sum);
        System.out.println("a "+ "*b " + " = "+product);
        System.out.println(""+ "" + quot);
        System.out.println(rem);

    }
}
