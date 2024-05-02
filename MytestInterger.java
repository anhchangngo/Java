public class MytestInterger {
        public static void main(String[] args) {
            // Create instances of MyInteger
            MyInteger myInteger1 = new MyInteger(10);
            MyInteger myInteger2 = new MyInteger(20);
            MyInteger myInteger3 = new MyInteger(10);
    
            // Test the equals method
            System.out.println("myInteger1 equals myInteger2: " + myInteger1.equals(myInteger2)); // false
            System.out.println("myInteger1 equals myInteger3: " + myInteger1.equals(myInteger3)); // true
        }
    }
