public class NameCard {
    private String Name;
    private String Phone;
    private String eMail;

    public NameCard(String Name, String Phone, String eMail){
        this.Name = Name;
        this.Phone = Phone;
        this.eMail = eMail;
    }

    public String getName(){
        return Name;
    }

    public String getPhone(){
        return Phone;
    }

    public String geteMail(){
        return eMail;
    }
}