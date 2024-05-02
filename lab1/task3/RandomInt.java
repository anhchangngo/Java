public class RandomInt {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        //  a random double between 0.0 (inclusive) and 1.0 (exclusive) using the Math.random
        double r = Math.random();
        int value = (int) (a + r);
        
        System.out.println(value);
    }
}

// Use : java RandomInt 3
// Output : 3