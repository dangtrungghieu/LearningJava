public class Main {
    public static void main(String[] args) {
        NgayChieu ngaychieu1 = new NgayChieu(10,11,2020);
        NgayChieu ngaychieu2 = new NgayChieu(8,10,2019);
        NgayChieu ngaychieu3 = new NgayChieu(20,9,2023);

        HangSanXuat hangsanxuat1 = new HangSanXuat("PhuongNamFilm","Viet Nam");
        HangSanXuat hangsanxuat2 = new HangSanXuat("KingDom","Han Quoc");
        HangSanXuat hangsanxuat3 = new HangSanXuat("MaiLa","Nhat Ban");

        BoPhim bophim1 = new BoPhim("Rua va tho", 2019, 50000, hangsanxuat1, ngaychieu1);
        BoPhim bophim2 = new BoPhim("Cua thien tra dia", 2017, 55000, hangsanxuat2, ngaychieu2);
        BoPhim bophim3 = new BoPhim("Co cong mai sat, co ngay nen kim", 2020, 105000, hangsanxuat3, ngaychieu3);

        //Yeu cau 1
        System.out.println(bophim1.timPhimGiaReHon(bophim2));;
        System.out.println(bophim1.timPhimGiaReHon(bophim3));;

        //Yeu cau 2:
        bophim1.inTenHangSanXuat();

        //Yeu cau 3:
        System.out.println(bophim1.giaVeSauKhiGiam(10));

    }
}
