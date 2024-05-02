public class circle extends shape{

    private double radius;

    public circle (coordinates coordinate, double radius){
        super(coordinate);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
