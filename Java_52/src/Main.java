import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String s1 = "Dang";
        String s2 = "Trung";
        String s3 = "Hieu";


        //Ham concat
        String s4 = s1 + s2 + s3;
        String s5 = s1.concat(s2).concat(s3);
        System.out.println(s4);
        System.out.println(s5);
        //Trong java gia tri cua cac chuoi duoc dinh nghia tu ban dau la khong thay doi duoc

        //Ham replace => Thay the
        String s6 = "Java Backend";
        String s7 = s6.replaceAll("Backend","Backend Developer");
        System.out.println(s7);

        //toUpperCase => Viet hoa
        //toLowerCase => Viet thuong
        String s8 = s1.toLowerCase();
        String s9 = s2.toUpperCase();
        System.out.println(s8);
        System.out.println(s9);

        //trim(): Xoa khoang trang du thua o truoc va sau chuoi
        String s10 = " Dang Trung Hieu ";
        System.out.println(s10.trim());

        //subString (cat chuoi con)
        String s11 = "Hieu la toi";
        String s12 = s11.substring(5);
        String s13 = s11.substring(0,4);
        System.out.println(s12);
        System.out.println(s13);
        //So sau luon la vi tri - 1
    }
}
