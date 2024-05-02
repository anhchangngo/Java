/*      ORIGINAL
public class Automobile {
    static double fuel;
    static double speed;
    static String license;
    static void init(double f, double s, String l) {
        fuel = f;
        speed = s;
        license = l;
}
    static void accelerate(double v) {
        if (fuel > 0) speed += v;
}
    static void decelerate(double v) {
        if (fuel <= 0) speed -= v;
}
    public static void main(String args[]) {
        init(4.5,34,"29JAD");
        accelerate(4);
        decelerate(5);
}
}
*/

//static (at class level) used to declare members (variables, methods) that belong to the class itself
//rather than to instance of the class 
//using static mean there is only one copy of static member shared among all instances of the class
//(all instance share the same data)
//which violates the Encapsulation principle because it allows external code gains unauthorized access 
//(not this instance of class) to the internal state of an object 
//while relating instance members, each instance of the class will has its own copy of the instance members
//which means objects have control over their own state
//=> static variable -> private variable
//=> static method -> public method

//replace init() method to constructor of class Automobile

//create a new test file called "AutomobileTestDrive" to test 
//add more statement to print out to the screen

public class Automobile {
    private double fuel;
    private double speed;
    private String license;

    public double getFuel() {
        return fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public String getLicense() {
        return license;
    }

    // Constructor
    public Automobile(double f, double s, String l) {
        fuel =f;
        speed = s;
        license = l;
    }

    public void accelerate(double v) {
        if (fuel > 0) {
            speed += v;
        }
    }

    public void decelerate(double v) {
        if (fuel <= 0) speed -= v;
}

}
