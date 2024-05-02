public abstract class shape {
    protected coordinates coordinate;

    public shape(coordinates coordinate){
        this.coordinate = coordinate;
    }

    public coordinates getCoordinate(){
        return coordinate;
    }

    public void setCoordinate(coordinates coordinate){
        this.coordinate = coordinate;
    }

    public abstract double calculateArea(); // 1 phương thức abstract k co phan hien thuc cu the phuong thuc do
}

// 1 class k muốn hiện thực nó cụ thể, muốn nó là 1 khái niệm trừu tượng chung chung 
