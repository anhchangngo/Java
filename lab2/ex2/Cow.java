public class Cow {
    private String name;
    private String breed;
    private int age;
    
    public Cow(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        setAge(age);
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }
        else {
            System.out.println("Invalid age, please make new age.");
        }
    }

    public void moo(){
        System.out.println("Moo...!");
    }
}
