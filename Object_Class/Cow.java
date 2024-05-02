public class Cow {
    public static void main (String[] args){
        Cow myCow = new Cow();
        String s = myCow.getClass().getName();
        
        System.out.println("Class Name " + s);
        System.out.println("Hash Code " + myCow.hashCode());
    }
}
