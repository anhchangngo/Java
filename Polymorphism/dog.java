public class dog extends animal {
    void move(){
        System.out.println("dog is running");
    }

    @Override
    void animalSound(){
        System.out.println("GAU GAU");
    }
}
