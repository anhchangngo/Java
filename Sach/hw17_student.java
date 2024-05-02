import java.util.List;

public class hw17_student {
    private String name;
    private String date;
    private List<String> math_courses;
    private List<Double> marks;

    public hw17_student(String name, String date, List<String> math_courses, List<Double> marks) {
        this.name = name;
        this.date = date;
        this.math_courses = math_courses;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getCourse() {
        return math_courses;
    }

    public void setCourse(List<String> math_courses) {
        this.math_courses = math_courses;
    }

    public List<Double> getMark() {
        return marks;
    }

    public void setMark(List<Double> marks) {
        this.marks = marks;
    }

    public double AvgMark() {
        double sum = 0;
        for(double mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }
}
