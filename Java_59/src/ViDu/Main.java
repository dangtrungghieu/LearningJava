package ViDu;

public class Main {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb1 = new ThoiKhoaBieu("Toan, Ly, Hoa", Day.Monday);
        ThoiKhoaBieu tkb2 = new ThoiKhoaBieu("Van, Su, Dia", Day.Tuesday);
        System.out.println(tkb1.toString());
        int n = Months.January.getSoNgay();
        System.out.println(n);
    }
}
