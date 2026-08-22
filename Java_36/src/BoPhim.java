public class BoPhim {
    private String tenPhim;
    private int namSanXuat;
    private double giaVe;
    private HangSanXuat hangSanXuat;
    private NgayChieu ngayChieu;

    //Constructor
    public BoPhim(String tenPhim, int namSanXuat, double giaVe, HangSanXuat hangSanXuat, NgayChieu ngayChieu) {
        if(tenPhim.trim().length() > 0){
            this.tenPhim = tenPhim;
        }
        else {
            this.tenPhim = "Chua nhap ten phim";
        }
        if (namSanXuat > 0){
            this.namSanXuat = namSanXuat;
        }
        else {
            this.namSanXuat = 1;
        }

        if (giaVe >= 0){
            this.giaVe = giaVe;
        }else  {
            this.giaVe = 0;
        }

        this.hangSanXuat = hangSanXuat;
        this.ngayChieu = ngayChieu;
    }

    //Get,Set
    public String getTenPhim() {
        return tenPhim;
    }
    public void setTenPhim(String tenPhim) {
        if(tenPhim.trim().length() > 0){
            this.tenPhim = tenPhim;
        }
        else {
            this.tenPhim = "Chua nhap ten phim";
        }
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }
    public void setNamSanXuat(int namSanXuat) {
        if (namSanXuat > 0){
            this.namSanXuat = namSanXuat;
        }
        else {
            this.namSanXuat = 1;
        }
    }

    public double getGiaVe() {
        return giaVe;
    }
    public void setGiaVe(double giaVe) {
        if (giaVe >= 0){
            this.giaVe = giaVe;
        }else {
            this.giaVe = 0;
        }
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }
    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public NgayChieu getNgayChieu() {
        return ngayChieu;
    }
    public void setNgayChieu(NgayChieu ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    //Yeu cau 1: Kiem tra gia cua bo phim nhap vao co nho hon bo phim khac khong?
    public boolean timPhimGiaReHon(BoPhim boPhim){
        return this.giaVe < boPhim.giaVe;
    }

    //Yeu cau 2: In ten cua hang san xuat phim
    public void inTenHangSanXuat(){
        System.out.println(this.hangSanXuat.getTenHangSanXuat());
    }

    //Yeu cau 3: Tinh gia tien sau khi giam x%
    public double giaVeSauKhiGiam(double x){
        return this.giaVe*(1 - x / 100);
    }
}
