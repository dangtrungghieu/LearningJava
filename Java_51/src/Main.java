public class Main {
    public static void main(String[] args) {
        String s1 = "Dang Trung Hieu, ky su Java backend devoloper, Dang Trung Hieu";
        String s2 = "Trung Hieu";
        String s3 = "Sinh vien Dai hoc Thu Dau Mot";
        char ch = 'M';

        //indexOf(String hoac char hoac
        System.out.println(s1.indexOf(s2)); //Ra duong => vi tri bat dau cua chuoi
        System.out.println(s1.indexOf(s3)); //Ra am => khong co trong chuoi

        System.out.println(s1.indexOf(s2,15));
        System.out.println(s1.indexOf(s2,0));
        System.out.println(s1.indexOf(ch,0));
        System.out.println(s3.indexOf(ch,0));

        //LastIndexOf (Tim kiem tu phai sang trai)
        System.out.println(s2.length() - s2.lastIndexOf(" ") -1);

    }
}
