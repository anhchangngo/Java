public class Oto extends Phuongtien{

    private String Nhienlieu;

    public Oto(String tenPhuongtien, Hangsanxuat hangSanxuat, String Nhienlieu){
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
        return 60;
    }
}
