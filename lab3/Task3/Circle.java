public class Circle extends Point implements Area {
    protected double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public String calName() {
        return "Circle";
    }

    public double calArea() {
        return Math.PI * Math.pow(r, 2);
    }
}