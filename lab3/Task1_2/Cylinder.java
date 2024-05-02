public class Cylinder extends Circle {

    private double h;  // height

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    public double getHeight() {
        return h;
    }

    public void setHeight(double h) {
        this.h = h;
    }

    @Override
    public double calArea() {
        return Math.PI * r * (h + r);
    }

    @Override
    public double calVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }
}
