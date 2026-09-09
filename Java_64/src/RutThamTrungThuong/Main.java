package RutThamTrungThuong;

import Source.RutThamTrungThuongSource;
import Source.RutThamTrungThuongSource_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RutThamTrungThuongSource_2 chuongTrinh = new RutThamTrungThuongSource_2();
        Scanner input = new Scanner(System.in);
        int choice;
        String maSo;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Them ma trung thuong. \n" +
                    "2. Xoa ma trung thuong. \n" +
                    "3. Kiem tra ma trung thuong co trong danh sach chua?. \n" +
                    "4. Xoa tat ca cac ma hien co. \n" +
                    "5. Dem so ma trung thuong hien co. \n" +
                    "6. Rut tham trung thuong. \n" +
                    "7. In tat ca cac ma hien co. \n" +
                    "0. Them ma trung thuong. \n" +
                    "-----Nhap lua chon cua ban: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ma so: ");
                    maSo = input.nextLine();
                    chuongTrinh.add(maSo);
                    System.out.println("Da them ma so: " + maSo);
                    break;
                case 2:
                    System.out.println("Nhap ma so: ");
                    maSo = input.nextLine();
                    chuongTrinh.remove(maSo);
                    System.out.println("Da xoa ma so: " + maSo);
                    break;
                case 3:
                    System.out.println("Nhap ma so: ");
                    maSo = input.nextLine();
                    chuongTrinh.checkExist(maSo);
                    if (chuongTrinh.checkExist(maSo)) {
                        System.out.println("Ma so " + maSo + " da co trong danh sach!");
                    } else {
                        System.out.println("Ma so " + maSo + " khong co trong danh sach!");
                    }
                    break;
                case 4:
                    chuongTrinh.clear();
                    System.out.println("Da xoa toan bo ma so hien co!");
                    break;
                case 5:
                    System.out.println("Chuong trinh hien co tong: " + chuongTrinh.size() + " ma so!");
                    break;
                case 6:
                    System.out.println("Dang rut tham trung thuong.......");
                    System.out.println("Ma so may man la: " + chuongTrinh.rutTham());
                    break;
                case 7:
                    System.out.print("Cac ma so hien co trong chuong trinh la: ");
                    chuongTrinh.printAll();
                    break;
            }
        } while (choice != 0);
    }
}
