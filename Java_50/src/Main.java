public class Main {
    public static void main(String[] args) {
        String s1 = "Dang Trung Hieu";
        String s2 = "dang trung hieu";
        String s3 = "Dang Trung Hieu";
        //equals (so sanh 2 chuoi giong nhau, co phan biet hoa va thuong)
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s1 equals s2: " + s1.equals(s2));

        //equalsIgnoreCase (so sanh 2 chuoi giong nhau, khong phan biet hoa va thuong)
        //equals la bang; ignoreCase la bo qua chu hoa thuong
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));

        //Trong chuc nang mat khau thi phai dung equals

        //compareTo (So sanh >;<;=) => Dung trong chuc nang sap xep danh sach ten theo alpha b
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van";
        String sv4 = "Nguyen Van a";

        System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
        //Ra am => nho hon
        //Ra duong => lon hon
        //Ra 0 => bang nhau

        //compareToIgnoreCase => Khong phan biet hoa, thuong

        //regionMatches => So sanh mot doan tu vi tri bat ky toi 1 khoang cach
        String r1 = "DangTrunghieu";
        String r2 = "TrungHieu";
        boolean check = r1.regionMatches(false,4,r2,0,9);
        System.out.println(check);

        //Startwith => Ham kiem tra chuoi bat dau co phai la chuoi ....
        String sdt = "0963840472";

        System.out.println(sdt.startsWith("0963"));
        System.out.println(sdt.startsWith("0937"));

        //Endwith => Ham kiem tra chuoi ket thuc co phai la chuoi.....
        String tenFile1 = "File1.jpg";
        String tenFile2 = "File2.docx";
        String loaiFile = tenFile2.endsWith(".jpg")? "Hinh anh" : "File word";
        System.out.println(loaiFile);
    }
}
