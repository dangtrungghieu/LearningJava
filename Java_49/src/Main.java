import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Nhap vao chuoi: ");
        str = sc.nextLine();
        System.out.println("-----------------");

        //Ham length (lay do dai chuoi)
        int doDai = str.length();
        System.out.println(doDai);
        //Ham charAt() (lay ky tu tai mot vi tri bat ky)
        for (int i = 0; i < doDai; i++) {
            System.out.println("Vi tri thu " + i + " la: " + str.charAt(i));
        }
        //Ham getChars(startStr, endStr - 1, arrsave, startSave)
        char[] arrchar = new char[10];
        str.getChars(2,5,arrchar,0);
        System.out.println(arrchar);

        //Getbytes => Chuyen ky tu ve ma ASCII
        byte []arrbytes = new byte[10];
        str.getBytes(2,4,arrbytes,0);
        for (int i = 0; i < arrbytes.length; i++) {
            System.out.print(arrbytes[i] + " ");
        }

    }
}
