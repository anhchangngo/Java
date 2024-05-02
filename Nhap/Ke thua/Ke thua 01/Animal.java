
public class Animal {
    protected String Name; // class nam ben duoi co the su dung duoc, class nam ben ngoai khong su dung duoc

    public Animal(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void eat(){
        System.out.println("NHOAM NHOAM");
    }
}
