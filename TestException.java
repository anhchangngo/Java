import java.util.*;

/*
// Invalid input 
public class TestException
{
    public static void main (String args[]) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Numerator: ");
        int numerator = scanner.nextInt(); 
        System.out.print("Denominator: ");
        int denominator = scanner.nextInt();
        int result = numerator/denominator;    
        System.out.printf("\nResult: %d / %d = %d\n",numerator, denominator, result);
} 
}
*/


// Divide by Zero
public class TestException
{
public static void main (String args[]) { 
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Numerator: ");
    int numerator = scanner.nextInt(); 
    System.out.print("Denominator: ");
    int denominator = scanner.nextInt();
    int result = numerator/denominator; 
    System.out.printf("\nResult: %d / %d = %d\n",numerator, denominator, result );
} 
}