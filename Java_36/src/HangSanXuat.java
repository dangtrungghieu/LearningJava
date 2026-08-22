public class HangSanXuat {
    private String tenHangSanXuat;
    private String quocGia;

    //Constructor
    public HangSanXuat(String tenHangSanXuat, String quocGia) {
        if (tenHangSanXuat.trim().length() > 0){
            this.tenHangSanXuat = tenHangSanXuat;
        }else {
            this.tenHangSanXuat = "Chua nhap ten hang san xuat";
        }
        if (quocGia.trim().length() > 0){
            this.quocGia = quocGia;
        }
        else {
            this.quocGia = "Chua nhap quoc gia";
        }
    }

    //Get, Set
    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }
    public void setTenHangSanXuat(String tenHangSanXuat) {
        if (tenHangSanXuat.trim().length() > 0){
            this.tenHangSanXuat = tenHangSanXuat;
        }else {
            this.tenHangSanXuat = "Chua nhap ten hang san xuat";
        }
    }
    public String getQuocGia() {
        return quocGia;
    }
    public void setQuocGia(String quocGia) {
        if (quocGia.trim().length() > 0){
            this.quocGia = quocGia;
        }
        else {
            this.quocGia = "Chua nhap quoc gia";
        }
    }
}
