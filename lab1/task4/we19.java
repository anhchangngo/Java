public class we19 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        boolean isDivisible = (x % 7 == 0) && (y % 7 == 0);

        System.out.println(isDivisible);
    }
}
