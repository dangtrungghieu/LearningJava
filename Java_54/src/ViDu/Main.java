package ViDu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(100,"Nguyen Van Anh", "Lop 1A", 9);
        SinhVien sv2 = new SinhVien(250, "Nguyen Van Cuong", "Lop 1A", 6);
        SinhVien sv3 = new SinhVien(300, "Nguyen Van Binh", "Lop 1A", 8);

        SinhVien [] a = new SinhVien[]{sv1, sv2, sv3};
        System.out.println("Ban dau: " + Arrays.toString(a));
        //Ham sap xep doi tuong sinh vien
        Arrays.sort(a);
        System.out.println("Luc sau: " + Arrays.toString(a));
        System.out.println("Tim kiem: " + Arrays.binarySearch(a, sv3));
    }
}
