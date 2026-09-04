package ViDu;

public class SinhVien implements Comparable<SinhVien> {
    private int maSV;
    private String hoVaTen;
    private String tenLop;
    private double diemTB;

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", tenLop='" + tenLop + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }

    public SinhVien(int maSV, String hoVaTen, String tenLop, double diemTB) {
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTB = diemTB;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    //Cat ten
    public String getTen(){
        String s = this.getHoVaTen().trim();
        if(s.indexOf(" ") >= 0){
            int index1 = s.lastIndexOf(" ");
            return s.substring(index1 + 1);
        }else{
            return s;
        }
    }

    @Override
    public int compareTo(SinhVien o) {
        //Tra ve 3 tinh huong: <0 (nho hon), =0 , >0 (lon hon);
        //So sanh maSV
        return this.maSV - o.maSV;

        //So sanh tenSV
//        String tenThis = this.getTen();
//        String tenOther = o.getTen();
//        return tenThis.compareTo(tenOther);
    }
}
