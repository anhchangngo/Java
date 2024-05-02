/* 
public class hw15_lecturer extends hw15_course {
    private String IDlc;
    private String Namelc;

    public hw15_lecturer(String IDcs, String Namecs, Double Mid, Double Final, String IDlc, String Namelc) {
        super(IDcs, Namecs, Mid, Final);
        this.IDlc = IDlc;
        this.Namelc = Namelc;
    }

    public String getIDlc() {
        return IDlc;
    }

    public void setIDlc(String IDlc) {
        this.IDlc = IDlc;
    }

    public String getNamelc() {
        return Namelc;
    }

    public void setNamelc(String Namelc) {
        this.Namelc = Namelc;
    }
}
*/

public class hw15_lecturer extends hw15_course {
    private String IDl;
    private String Namel;

    public hw15_lecturer(int IDc, String Namec, double mid, double fin, String IDl, String Namel) {
        super(IDc, Namec, mid, fin);
        this.IDl = IDl;
        this.Namel = Namel;
    }

    public String getIDl() {
        return IDl;
    }

    public void setIDl(String IDl) {
        this.IDl = IDl;
    }

    public String getNamel() {
        return Namel;
    }

    public void setNamel(String Namel) {
        this.Namel = Namel;
    }

}