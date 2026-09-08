package Data;

import java.util.Objects;

public class SinhVien {
    private String maSV;
    private String hoVaTen;
    private int namSinh;
    private float diemTB;

    //Constructor empty
    public SinhVien(String maSV) {
        this.maSV = maSV;
    }

    //Constructor
    public SinhVien(String maSV, String hoVaTen, int namSinh, float diemTB) {
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }
    //Generate get, set
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    //Ham toString
    @Override
    public String toString() {
        return "SinhVien [" +
                "maSV= '" + maSV + '\'' +
                ", hoVaTen= '" + hoVaTen + '\'' +
                ", namSinh= " + namSinh +
                ", diemTB= " + diemTB +
                ']';
    }
    //Ham equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(this.maSV, ((SinhVien) o).maSV);
    }
}
