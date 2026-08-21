public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacGia;

    //Constructor
    public Sach (String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
        if (tenSach.trim().length() > 0){
            this.tenSach = tenSach;
        }else {
            this.tenSach = "Chua nhap ten sach";
        }

        if (giaBan >= 0){
            this.giaBan = giaBan;
        }else {
            this.giaBan = 0;
        }

        if (namXuatBan > 0){
            this.namXuatBan = namXuatBan;
        }else {
            this.namXuatBan = 1;
        }

        this.tacGia = tacGia;
    }

    //Get, Set
    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        if (tenSach.trim().length() > 0){
            this.tenSach = tenSach;
        }else {
            this.tenSach = "Chua nhap ten sach";
        }
    }

    public double getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(double giaBan) {
        if (giaBan >= 0){
            this.giaBan = giaBan;
        }else {
            this.giaBan = 0;
        }
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        if (namXuatBan > 0){
            this.namXuatBan = namXuatBan;
        }else{
            this.namXuatBan = 1;
        }
    }

    public TacGia getTacGia() {
        return tacGia;
    }
    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    //In ten sach
    public void inTenSach(){
        System.out.println(this.tenSach);
    }

    //So sanh nam xuat ban bang equals
    public boolean kTraCungNamXuatBan(Sach sach){
        return this.namXuatBan == sach.namXuatBan;
    }

    //Gia sach sau khi giam x%
    public double giamGia(double x){
        return (this.giaBan * (1 - x / 100));
    }
}
