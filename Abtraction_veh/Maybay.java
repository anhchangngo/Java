public class Maybay extends Phuongtien{

    private String Nhienlieu;

    public Maybay(String tenPhuongtien,Hangsanxuat hangSanxuat, String Nhienlieu){
        super(tenPhuongtien, hangSanxuat);
        this.Nhienlieu = Nhienlieu;
    }

    public String getNhienlieu(){
        return Nhienlieu;
    }

    public void setNhienlieu(String Nhienlieu){
        this.Nhienlieu = Nhienlieu;
    }

    @Override
    public double layVanToc(){
        return 500;
    }

    public void catcanh(){
        System.out.println("Cat canh");
    }

    public void hacanh(){
        System.out.println("Hacanh");
    }
}
