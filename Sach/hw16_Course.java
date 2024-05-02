import java.util.List;
import java.util.ArrayList;

public class hw16_Course {
    private String name;
    private List<hw16_Lecturer> lecs;
    private List<hw16_Student> stds;

    public hw16_Course(String name) {
        this.name = name;
        this.lecs = new ArrayList<>();
        this.stds = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<hw16_Lecturer> getLec() {
        return lecs;
    }

    public void setLec(List<hw16_Lecturer> lecs) {
        this.lecs = lecs;
    }

    public List<hw16_Student> getStd() {
        return stds;
    }

    public void setStd(List<hw16_Student> stds) {
        this.stds = stds;
    }

    public void addLec(hw16_Lecturer lc) {
        lecs.add(lc);
    }

    public void addStd(hw16_Student std) {
        stds.add(std);
    }

}