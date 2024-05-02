public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    } 

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public Vector add(Vector that){
        return new Vector(this.x + that.x, this.y + that.y);
    }
    // because vector + vector becomes a new vector
    public Vector subtract(Vector that){
        return new Vector(this.x - that.x, this.y - that.y);
    }
    // because vector - vector becomes a new vector
    public double multiple(Vector that){
        return (this.x * that.x) + (this.y * that.y);
    }
    // but vector * vector becomes a number
}
