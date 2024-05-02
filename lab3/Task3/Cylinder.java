public class Cylinder extends Circle implements Volume {
    private double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public String calName() {
        return "Cylinder";
    }

    public double calArea() {
        return 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
    }

    public double calVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }
}