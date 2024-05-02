public class ex5 {
    public static void main(String args[]){
        int a = 3;
        int b = 5;
        int c = 8;
        boolean bigger;
        bigger = (a > b) || (a < c);
        
        System.out.println(bigger);
    }
}
/*
 | Operand 1 | Operand 2 | Result (Operand 1 ^ Operand 2) |
|-----------|-----------|---------------------------------|
|    false  |   false   |              false              |
|    false  |   true    |              true               |
|    true   |   false   |              true               |
|    true   |   true    |              false              |
 */