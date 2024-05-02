public class NameCardTestDrive {
    public static void main(String[] args){
        NameCard MyNameCard = new NameCard("DatDo", "093145628", "datdt.22bi13075@usth.edu.vn");
        // phone is private information so it's fake !
        System.out.println("My Name : " + MyNameCard.getName());
        System.out.println("My Phone : " + MyNameCard.getPhone());
        System.out.println("My eMail : " + MyNameCard.geteMail());
    }
}
