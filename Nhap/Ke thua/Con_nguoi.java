public class Con_nguoi {
    private String Name;
    private int Age;

    public Con_nguoi(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
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
