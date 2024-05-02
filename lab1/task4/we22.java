public class we22 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two command-line arguments: weight (in kilograms) and height (in meters)");
            return;
        }

        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double bmi = calculateBMI(weight, height);

        System.out.println("BMI: " + bmi);
    }

    public static double calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;
    }
}
