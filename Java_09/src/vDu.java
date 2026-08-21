import java.util.Scanner;

public class vDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho va ten: ");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhap ma sinh vien");
        long maSV = sc.nextLong();
        System.out.println("Nhap diem sinh vien");
        double diemSV = sc.nextDouble();
        System.out.println("------------------");
        System.out.println("Ho va ten" + hoVaTen);
        System.out.println("Ma sinh vien " + maSV);
        System.out.println("Diem sinh vien " + diemSV);
    }
}
