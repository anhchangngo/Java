public class we18 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide three command-line arguments: x, y, and z");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        boolean b = (x < y && y < z) || (x > y && y > z);

        System.out.println("Are the values in ascending or descending order? " + b);
    }
}
