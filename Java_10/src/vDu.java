public class vDu {
    public static void main(String[] args) {
        int a = 100;
        int b = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Ép kiểu ngầm điịnh (đích > gốc)
        float c = a;
        float d = b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        // Ép kiểu tường minh (đích < gốc)
        float e = 3.5f;
        float f = 9.5f;

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int g = (int) e;
        int h = (int) f;

        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //Ép kiểu đối tượng (Tính kế thừa)

        // Ép kiểu qua lại đối tượng <-> cơ bản (nguyên thủy)

        Integer x = 10;
        System.out.println("x = " + x);


    }
}
