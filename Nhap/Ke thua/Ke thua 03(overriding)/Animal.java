/*
The principle: the subclass must be able to do anything the superclass declares
Overriding rules:
– Parameter types must be the same
• whatever the superclass takes as an argument, the subclass overriding the method must be able to take that same argument
– Return types must be compatible
• whatever the superclass declares as return type, the
subclass must return the same type or a subclass type – The method can't be less accessible
• a public method cannot be overridden by a private version
 */
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
        System.out.println("I'm eating ....");
    }

    public void makeSound(){
        System.out.println("I'm so noisy ...");
    }

    public void sleep(){
        System.out.println("zzzzzzzzzzzz");
    }
}
