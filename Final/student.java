// childe class of lecturer

public class student extends lecturer {
    private String ID_student;
    private String name_student;
    private double mid_score;
    private double final_score;

    public student(String ID_course, String name_course, String ID_lecturer, String name_lecturer, 
                   String ID_student, String name_student, double mid_score, double final_score) {
        super(ID_course, name_course, ID_lecturer, name_lecturer);
        this.ID_student = ID_student;
        this.name_student = name_student;
        this.mid_score = mid_score;
        this.final_score = final_score;
    }

    public String getIDstd() {
        return ID_student;
    }

    public void setIDstd(String ID_student) {
        this.ID_student = ID_student;
    }

    public String getNamestd() {
        return name_student;
    }

    public void setNamestd(String name_student) {
        this.name_student = name_student;
    }

    public double getMid_score() {
        return mid_score;
    }

    public void setMid_score(double mid_score) {
        this.mid_score = mid_score;
    }

    public double getFinal_score() {
        return final_score;
    }

    public void setFinal_score(double final_score) {
        this.final_score = final_score;
    }

    public String getResult() {
        if (getFinal_score() >= 10 && getMid_score() > 7) {
            return "Passed";
        } else {
            return "Retake";
        }
}
}