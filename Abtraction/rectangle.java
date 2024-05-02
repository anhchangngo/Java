public class rectangle extends shape {

    private double with, height;

    public rectangle(coordinates coordinate, double with, double height){
        super(coordinate);
        this.with = with;
        this.height = height;
    }

    public double getWith(){
        return with;
    }

    public void setWith(double with){
        this.with = with;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return with * height;
    }

}