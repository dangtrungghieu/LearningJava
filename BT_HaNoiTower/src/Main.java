import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        while ( n <= 0){
            n = input.nextInt();
        }
        chuyenDia(n,'A','B','C');
        // Co 3 cot: A,B,C
        // Ban dau: 3 dia theo thu tu tang dan nam o cot A (n=3)
        // Muc dich: chuyen 3 dia do qua cot C nhung van theo thu tu tang dan

    }
    public static void chuyenDia(int n, char cotNguon, char cotTrungGia, char cotDich ){
        if(n == 1){
            System.out.println("Chuyen dia tu " + cotNguon + " sang " + cotDich);
            return;
        }
        chuyenDia( n-1, cotNguon, cotDich, cotTrungGia);
        System.out.println("Chuyen dia tu " + cotNguon + " sang " + cotDich);
        chuyenDia(n-1, cotTrungGia, cotNguon, cotDich);
    }
}
