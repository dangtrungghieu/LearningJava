import java.util.Scanner;

public class vDu {
    public static void main(String[] args) {
        // Khai bao bien
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int tong = a + b;
        System.out.println(a + "+" + b + "=" + tong);

        float thuong  = (float)a / b;
        System.out.println(thuong);
    }
}
