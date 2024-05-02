
public class Animal {
    protected String Name;

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
        System.out.println("NHOAM NHOAM!");
    }
}
