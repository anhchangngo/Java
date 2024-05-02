public abstract class Phuongtien {

    protected String tenPhuongtien;
    protected Hangsanxuat hangSanxuat;

    public Phuongtien(String tenPhuongtien, Hangsanxuat hangSanxuat) {
        this.tenPhuongtien = tenPhuongtien;
        this.hangSanxuat = hangSanxuat;
    }

    public String getTenPhuongtien() {
        return tenPhuongtien;
    }

    public void setTenPhuongtien(String tenPhuongtien) {
        this.tenPhuongtien = tenPhuongtien;
    }

    public String gethangsanxuat(){
        return hangSanxuat.getTenHang();
    }

    public void batDau(){
        System.out.println("Bắt đầu chuyến đi");
    }

    public void tangToc(){
        System.out.println("Tang toc");
    }

    public void dung(){
        System.out.println("Dung");
    }

    public abstract double layVanToc();
}
