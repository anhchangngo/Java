// Class parents

public class course {
    private String ID_course;
    private String name_course;

    public course(String ID_course, String name_course) {
        this.ID_course = ID_course;
        this.name_course = name_course;
    }

    public String getIDcs() {
        return ID_course;
    }

    public void setIDcs(String ID_course) {
        this.ID_course = ID_course;
    }

    public String getNamecs() {
        return name_course;
    }

    public void setNamecs(String name_course) {
        this.name_course = name_course;
    }

}
