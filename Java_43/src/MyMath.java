public class MyMath {
    public int timMin(int a, int b){
        return a < b ? a : b;
    }
    public double timMin(double a, double b){
        return a < b ? a : b;
    }
    public double tinhTong(double a, double b){
        return a + b;
    }
    public int tinhTong(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
