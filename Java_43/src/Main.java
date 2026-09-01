public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println(myMath.timMin(3,4));
        System.out.println(myMath.timMin(5.5,6.7));
        int []a = new int[]{1,2,3,4,5};
        System.out.println(myMath.tinhTong(a));
        System.out.println(myMath.tinhTong(7.8,9.2));
    }
}
