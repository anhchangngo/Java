public class AutomobileTestDrive {
    public static void main(String[] args) {
        Automobile a = new Automobile(4.5, 34, "36AA");

        System.out.println("Initial fuel : " + a.getFuel());
        System.out.println("Initial speed : " + a.getSpeed());
        System.out.println("Initial License : " + a.getLicense());

        a.accelerate(4);
        a.decelerate(5);
        System.out.println("Final fuel : " + a.getFuel());
        System.out.println("Final speed : " + a.getSpeed());
    }
}
