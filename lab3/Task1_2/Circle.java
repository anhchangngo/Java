public class Circle extends Point {

    protected double r; // radius

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    @Override
    public double calArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calVolume() {
        System.out.println("A circle does not have a volume");
        return super.calVolume();
    }
    
    @Override
    public String getName() {
        return "Circle";
    }
}
