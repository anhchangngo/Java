public class ex8 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the number of lines to print as a command-line argument");
            return;
        }

        int numLines = Integer.parseInt(args[0]);

        for (int i = 1; i <= numLines; i++) {
            System.out.print(i + getSuffix(i) + " Hello");
            System.out.println();
        }
    }

    public static String getSuffix(int number) {
        int lastDigit = number % 10;
        int lastTwoDigits = number % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 13) {
            return "th";
        } else if (lastDigit == 1) {
            return "st";
        } else if (lastDigit == 2) {
            return "nd";
        } else if (lastDigit == 3) {
            return "rd";
        } else {
            return "th";
        }
    }
}
