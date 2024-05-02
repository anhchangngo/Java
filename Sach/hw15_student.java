/* 
import java.util.ArrayList;
import java.util.List;

public class hw15_student extends hw15_lecturer {
    private String IDst;
    private String Namest;
    List<hw15_lecturer> courses;


    public hw15_student(String IDcs, String Namecs, Double Mid, Double Final, String IDlc, String Namelc, String IDst, String Namest) {
        super(IDcs, Namecs, Mid, Final, IDlc, Namelc);
        this.IDst = IDst;
        this.Namest = Namest;
        this.courses = new ArrayList<>();
    }

    public String getIDst() {
        return IDst;
    }

    public void setIDst(String IDst) {
        this.IDst = IDst;
    }

    public String getNamest() {
        return Namest;
    }

    public void setNamest(String Namest) {
        this.Namest = Namest;
    }

    public List<hw15_lecturer> getCourses() {
        return courses;
    }

    public void addCourse(hw15_lecturer course) {
        courses.add(course);
    }

    public boolean isPassing() {
        double totalFinal = 0;
        boolean hasMidBelowSeven = false;
    
        for (hw15_lecturer course : courses) {
            totalFinal += (course.getFinal() != null) ? course.getFinal() : 0;
            /*
            Kiểm tra xem điểm cuối kỳ của khóa học có khác null hay không.
            Nếu khác null, thì giá trị điểm cuối kỳ được cộng vào totalFinal.
            Nếu bằng null, thì không có gì thay đổi đối với totalFinal.
         
            if (course.getMid() != null && course.getMid() < 7) {
                hasMidBelowSeven = true;
            }
        }
        
        double averageFinal = totalFinal / courses.size();
    
        return averageFinal >= 10 && !hasMidBelowSeven;
    }
    
}
*/

import java.util.List;
import java.util.ArrayList;

public class hw15_student extends hw15_lecturer {
    private String IDs;
    private String Names;
    private List<hw15_lecturer> crs;

    public hw15_student(int IDc, String Namec, double mid, double fin, String IDl, String Namel, String IDs, String Names) {
        super(IDc, Namec, mid, fin, IDl, Namel);
        this.IDs = IDs;
        this.Names = Names;
        this.crs = new ArrayList<>();
    }

    public String getIDs() {
        return IDs;
    }

    public void setIDs(String IDs) {
        this.IDs = IDs;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String Names) {
        this.Names = Names;
    }

    public List<hw15_lecturer> getCourse() {
        return crs;
    }

    public void setCourse(List<hw15_lecturer> crs) {
        this.crs = crs;
    }

    public void addCourse(hw15_lecturer cr) {
        crs.add(cr);
    }

    public boolean isPassing() {
        double avgFinal = 0;
        boolean MidBellow7 = false;

        for(hw15_lecturer cr : crs) {
            avgFinal += cr.getFin();
            if(cr.getMid() <= 7) {
                MidBellow7 = true;
            }
        }
        avgFinal = avgFinal / crs.size();
        return avgFinal >= 10 && !MidBellow7;
    }
}