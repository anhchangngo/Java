public class CowTestDrive {
    public static void main(String[] args){
        Cow InfoCow = new Cow("Tun", "Kobe", -1);

        // InfoCow.setAge(5);

        System.out.println("Cow's name : " + InfoCow.getName());
        System.out.println("Cow's breed : " + InfoCow.getBreed());
        System.out.println("Cow's age : " + InfoCow.getAge());

        InfoCow.moo();   // print: Moo...!
    }
}
