package Main;

import Data.DanhSachSinhVien;
import Data.SinhVien;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tao moi danh sach
        DanhSachSinhVien ds = new DanhSachSinhVien();
        Scanner sc = new Scanner(System.in);
        //Nhan dau . thay vi dau ,
        sc.useLocale(Locale.US);
        int choice = 0;
        do {
            //Tao lua chon cua nguoi dung
            System.out.println("-----MENU CHUC NANG-----");
            System.out.println("1. Them sinh vien. \n" +
                    "2. In danh sach tat ca sinh vien hien co. \n" +
                    "3. Danh sach sinh vien hien tai co rong khong? \n" +
                    "4. So luong sinh vien hien co trong danh sach. \n" +
                    "5. Reset danh sach sinh vien. \n" +
                    "6. Kiem tra sinh vien co ton tai chua (nhap vao maSV). \n" +
                    "7. Xoa sinh vien (nhap vao maSV). \n" +
                    "8. Tim kiem sinh vien (nhap vao hoTen) \n" +
                    "9. In danh sach theo thu tu diemTB giam dan. \n");
            System.out.println("Hay nhap lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap maSV: ");
                    String maSV = sc.nextLine();
                    System.out.println("Nhap hoTenSV: ");
                    String hoTenSV = sc.nextLine();
                    System.out.println("Nhap namSinh: ");
                    int namSinh = sc.nextInt();
                    System.out.println("Nhap diemTB: ");
                    float diemTB = sc.nextFloat();
                    SinhVien sv = new SinhVien(maSV, hoTenSV, namSinh, diemTB);
                    ds.Add(sv);
                    System.out.println("Da them sinh vien thanh cong");
                    break;
                case 2:
                    ds.PrintAll();
                    break;
                case 3:
                    System.out.println(ds.CheckEmptyList());
                    break;
                case 4:
                    System.out.println("So luong sinh vien co trong danh sach la: " + ds.CountList());
                    break;
                case 5:
                    ds.ListForEmpty();
                    System.out.println("Danh sach da duoc reset!");
                    break;
                case 6:
                    System.out.println("Nhap maSV can kiem tra: ");
                    String inputMaSV = sc.nextLine();
                    SinhVien svCanKiemTra = new SinhVien(inputMaSV);
                    System.out.println(ds.CheckExist(svCanKiemTra));
                    break;
                case 7:
                    System.out.println("Nhap maSV can xoa: ");
                    String inputMaSVCanXoa = sc.nextLine();
                    SinhVien svCanXoa = new SinhVien(inputMaSVCanXoa);
                    ds.Delete(svCanXoa);
                    System.out.println("Da xoa sinh vien co maSV la: " + inputMaSVCanXoa);
                    break;
                case 8:
                    System.out.println("Nhap hoTenSV can tim kiem: ");
                    String inputHoTenSV = sc.nextLine();
                    ds.Search(inputHoTenSV);
                case 9:
                    ds.sapXepGiamDan();
                    ds.PrintAll();
                    break;
            }

        } while (choice != 0);
    }
}
