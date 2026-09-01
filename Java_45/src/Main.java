public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hang 1", "VietNam");
        HangSanXuat h2 = new HangSanXuat("Hang 2", "Venezuela");
        HangSanXuat h3 = new HangSanXuat("Hang 3", "NhatBan");

        PhuongTienDiChuyen p1 = new MayBay(h2, "May Bay", "Xang");
        PhuongTienDiChuyen p2 = new XeOto(h3, "Oto", "Xang");
        PhuongTienDiChuyen p3 = new XeDap(h1, "XeDap");

        System.out.println(p1.loaiPhuongTien + " " + p1.layTenHangSanXuat() + " " + p1.layVanToc());
        System.out.println(p2.loaiPhuongTien + " " + p2.layTenHangSanXuat() +  " " + p2.layVanToc());
        System.out.println(p3.loaiPhuongTien + " " +p3.layTenHangSanXuat()  +  " " + p3.layVanToc());

    }
}
