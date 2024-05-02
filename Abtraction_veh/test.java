public class test {
    public static void main(String[] args){
        Hangsanxuat h1 = new Hangsanxuat("Vinfast", "Vietnam");
        Hangsanxuat h2 = new Hangsanxuat("Tesla", "USA");
        Hangsanxuat h3 = new Hangsanxuat("Huawei", "China");

        Maybay p1 = new Maybay("Airbus", h1, "Oil");
        Phuongtien p2 = new Xedap("Thong Nhat", h2);
        Phuongtien p3 = new Oto("C300", h3, "Xang");

        System.out.println("Hang San Xuat");
        System.out. println("May Bay : " + p1.gethangsanxuat());

        System.out.println("Bat Dau");
        p2.batDau();

        System.out.println("Lay Van Toc");
        System.out.println("May Bay : " + p1.layVanToc());
        System.out.println("Xe dap : " + p2.layVanToc());
        System.out.println("O to : " + p3.layVanToc());

        p1.catcanh();
    }
}
