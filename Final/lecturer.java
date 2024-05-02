// child class of course

public class lecturer extends course {
    private String ID_lecturer;
    private String name_lecturer;

    public lecturer(String ID_course, String name_course, String ID_lecturer, String name_lecturer) {
        super(ID_course, name_course);
        this.ID_lecturer = ID_lecturer;
        this.name_lecturer = name_lecturer;
    }

    public String getIDlc() {
        return ID_lecturer;
    }

    public void setIDlc(String ID_lecturer) {
        this.ID_lecturer = ID_lecturer;
    }

    public String getNamelc() {
        return name_lecturer;
    }

    public void setNamelc(String name_lecturer) {
        this.name_lecturer = name_lecturer;
    }
}
