public class XeDap extends PhuongTienDiChuyen{
    public XeDap(HangSanXuat hangSanXuat, String loaiPhuongTien) {
        super(hangSanXuat, loaiPhuongTien);
    }
    @Override
    public double layVanToc() {
        return 20;
    }
}
