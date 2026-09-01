public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;
    public MayBay(HangSanXuat hangSanXuat, String loaiPhuongTien, String loaiNhienLieu) {
        super(hangSanXuat, loaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh(){
        System.out.println("Cat canh..........");
    }
    public void haCanh(){
        System.out.println("Ha canh..........");
    }

    @Override
    public double layVanToc(){
        return 880;
    }
}
