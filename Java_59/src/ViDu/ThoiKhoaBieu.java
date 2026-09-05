package ViDu;

public class ThoiKhoaBieu {
    private String tenMonHoc;
    private Day thu;

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public Day getThu() {
        return thu;
    }

    public void setThu(Day thu) {
        this.thu = thu;
    }

    public ThoiKhoaBieu(String tenMonHoc, Day thu) {
        this.tenMonHoc = tenMonHoc;
        this.thu = thu;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu{" +
                "tenMonHoc='" + tenMonHoc + '\'' +
                ", thu=" + thu +
                '}';
    }
}
