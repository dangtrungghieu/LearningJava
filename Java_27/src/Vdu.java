import java.util.Scanner;

public class Vdu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        try { // hanh dong thuc hien
            System.out.println("Nhap vao so nguyen n: ");
            n = sc.nextInt();
        } catch (Exception e){ //bi loi la vao catch
            System.out.println("Nhap du lieu khong dung");
        } finally { // luon thuc hien du co loi hay khong
            System.out.println("Finally");
        }

        System.out.println("Gia tri nhap la: " + n);
        System.out.println("Ket thuc chuong trinh");
    }
}
