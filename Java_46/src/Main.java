public class Main {
    public static void main(String[] args) {
        FX500 mtfx500 = new FX500();
        VN500 mtvn500 = new VN500();

        System.out.println(mtfx500.cong(4,3));
        System.out.println(mtvn500.chia(4,2));
        System.out.println(mtvn500.chia(4,0));
    }
}
