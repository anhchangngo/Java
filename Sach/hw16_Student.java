public class hw16_Student extends hw16_Person {
    private double attend;
    private double mid;
    private double fin;

    public hw16_Student(String ID, String Name, double attend, double mid, double fin) {
        super(ID, Name);
        this.attend = attend;
        this.mid = mid;
        this.fin = fin;
    }

    public double getAttend() {
        return attend;
    }

    public void setAttend(double attend) {
        this.attend = attend;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public double getFin() {
        return fin;
    }

    public void setFin(double fin) {
        this.fin = fin;
    }

    public double Final() {
        return attend * 0.1 + mid * 0.4 + fin * 0.5;
    }
}