import java.util.Scanner;

public class vDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a= ");
        int n = sc.nextInt();
        String ketQua = (n % 2 == 0)? "So chan": "So le";
        System.out.println(ketQua);

    }
}
