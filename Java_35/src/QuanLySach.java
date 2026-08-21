public class QuanLySach {
    public static void main(String[] args) {
        NgaySinh ngay1 = new NgaySinh(20,11,1997);
        NgaySinh ngay2 = new NgaySinh(11,9,2000);
        NgaySinh ngay3 = new NgaySinh(11,9,1996);

        TacGia tacGia1 = new TacGia("Nguyen Van A", ngay1);
        TacGia tacGia2 = new TacGia("Tran Thi B", ngay2);
        TacGia tacGia3 = new TacGia("Dinh Van C", ngay3);

        Sach sach1 = new Sach("Lap trinh Java Core", 200000, 2015,tacGia1);
        Sach sach2 = new Sach("The nao la Spring Boot", 120000, 2017, tacGia2);
        Sach sach3 = new Sach("Cac cau lenh SQL co ban den nang cao", 250000, 2017, tacGia3);

        // Yeu cau 1: In ra man hinh ten cua mot quyen sach
        sach1.inTenSach();


        // Yeu cau 2: Cho biet quyen sach bat ky co duoc xuat ban cung nam voi mot quyen sach nao do khong?
        System.out.println(sach1.kTraCungNamXuatBan(sach2));
        System.out.println(sach1.kTraCungNamXuatBan(sach3));

        //Yeu cau 3: Gia mot quyen sach sau khi giam x%
        System.out.println(sach1.giamGia(10));;

    }
}
