public class point extends shape{
    public point(coordinates coordinate){
        super(coordinate);
    }

    // vi la con cua shape nen phai co phuong thuc calcualteArea
    @Override
    public double calculateArea(){
        return 1;
    }
}
