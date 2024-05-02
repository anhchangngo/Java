public class Student {
    private String Name;
    private int Age;
    private String Class;
    private String School;

    public Student(String Name, int Age, String Class, String School){
        this.Name = Name;
        this.Age = Age;
        this.Class = Class;
        this.School = School;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age){
        this.Age = Age;
    }

    public String getStClass() {
        return Class;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public void eat(){
        System.out.println("mam mam");
    }

    public void drink(){
        System.out.println("uc uc");
    }

    public void sleep(){
        System.out.println("kho kho");
    }

}
