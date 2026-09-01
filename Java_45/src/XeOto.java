public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhieuLieu;
    //Constructor
    public XeOto(HangSanXuat hangSanXuat, String loaiPhuongTien, String loaiNhieuLieu){
        super(hangSanXuat, loaiPhuongTien);
        this.loaiNhieuLieu = loaiNhieuLieu;
    }
    //Get,Set
    public String getLoaiNhieuLieu() {
        return loaiNhieuLieu;
    }
    public void setLoaiNhieuLieu(String loaiNhieu) {
        this.loaiNhieuLieu = loaiNhieu;
    }
    @Override
    public double layVanToc() {
        return 80;
    }
}
