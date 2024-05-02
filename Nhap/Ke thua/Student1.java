public class Student1 extends Con_nguoi {
    private String Class;
    private String School;

    public Student1(String Name, int Age, String Class, String School){
        super(Name, Age);
        this.Class = Class;
        this.School = School;
    }

    public String getStClass(){
        return Class;
    }

    public void setClass(String Class){
        this.Class = Class;
    }

    public String getSchool(){
        return School;
    }

    public void setSchool(String School){
        this.School = School;
    }

    public void doHomework(){
        System.out.println("DO DO!");
    }
}

