public class TacGia {
    private String tenTacGia;
    private NgaySinh ngaySinh;

    //Constructor
    public TacGia(String tenTacGia, NgaySinh ngaySinh) {
        if (tenTacGia.trim().length() > 0) {
            this.tenTacGia = tenTacGia;
        }else{
            this.tenTacGia = "Chua nhap ten";
        }
        this.ngaySinh = ngaySinh;
    }

    //Get, Set
    public String getTenTacGia() {
        return tenTacGia;
    }
    public void setTenTacGia(String tenTacGia) {
        if (tenTacGia.trim().length() > 0) {
            this.tenTacGia = tenTacGia;
        }else{
            this.tenTacGia = "Chua nhap ten";
        }
    }
    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
