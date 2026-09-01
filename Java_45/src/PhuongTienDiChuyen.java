public abstract class PhuongTienDiChuyen {
    protected HangSanXuat hangSanXuat;
    protected String loaiPhuongTien;
    //Constructor
    public PhuongTienDiChuyen(HangSanXuat hangSanXuat, String loaiPhuongTien) {
        this.hangSanXuat = hangSanXuat;
        this.loaiPhuongTien = loaiPhuongTien;
    }
    //Getter and Setter

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    //Phuong thuc
    public String layTenHangSanXuat(){
        return this.hangSanXuat.layTenHangSanXuat();
    }
    public void BatDau(){
        System.out.println("Bat dau..............");
    }
    public void TangToc(){
        System.out.println("Tang toc............");
    }
    public void dungLai(){
        System.out.println("Dung lai.............");
    }
    public abstract double layVanToc();
}
