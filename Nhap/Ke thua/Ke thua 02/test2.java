

public class test2 {
    public static void main(String[] args){
        Dog d = new Dog();
        d.setName("Dung");
        System.out.println(d.getName());
        d.eat();

        BabyDog bd = new BabyDog();
        bd.setName("Dung con");
        System.out.println(bd.getName());
        bd.eat();
        bd.bark();
        bd.weep();

        Cat c = new Cat();
        c.setName("Doraemon");
        System.out.println(c.getName());
        c.meow();

        Bird b = new Bird();
        b.setName("Dulinggo");
        System.out.println(b.getName());
        b.fly();
    }
}
