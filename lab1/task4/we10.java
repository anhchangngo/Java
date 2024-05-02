public class we10 {
    public static void main(String[] args) {
        int order = 10; 

        for (int i = 0; i <= order; i++) {
            String fibonacciWord = generateFibonacciWord(i);
            System.out.println("f(" + i + "): " + fibonacciWord);
        }
    }

    public static String generateFibonacciWord(int n) {
        if (n == 0) {
            return "a";
        } else if (n == 1) {
            return "b";
        } else {
            String fibMinus1 = "b";
            String fibMinus2 = "a";
            String fibonacciWord = fibMinus2 + fibMinus1;

            for (int i = 2; i <= n; i++) {
                fibonacciWord = fibMinus1 + fibMinus2;
                fibMinus2 = fibMinus1;
                fibMinus1 = fibonacciWord;
            }

            return fibonacciWord;
        }
    }
}
