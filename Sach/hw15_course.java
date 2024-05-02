/*
public class hw15_course {
    private String IDcs;
    private String Namecs;
    private Double Mid;
    private Double Final;

    public hw15_course(String IDcs, String Namecs, Double Mid, Double Final) {
        this.IDcs = IDcs;
        this.Namecs = Namecs;
        this.Mid = Mid;
        this.Final = Final;
    }

    public String getIDcs() {
        return IDcs;
    }

    public void setIDcs(String IDcs) {
        this.IDcs = IDcs;
    }

    public String getNamecs() {
        return Namecs;
    }

    public void setNamecs(String Namecs) {
        this.Namecs = Namecs;
    }

    public Double getMid() {
        return Mid;
    }

    public Double getFinal() {
        return Final;
    }

}
*/

public class hw15_course {
    private int IDc;
    private String Namec;
    private double mid;
    private double fin;

    public hw15_course(int IDc, String Namec, double mid, double fin) {
        this.IDc = IDc;
        this.Namec = Namec;
        this.mid = mid;
        this.fin = fin;
    }

    public int getIDc() {
        return IDc;
    }

    public void setIDc(int IDc) {
        this.IDc = IDc;
    }

    public String getNamec() {
        return Namec;
    }

    public void setName(String Namec) {
        this.Namec = Namec;
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
}