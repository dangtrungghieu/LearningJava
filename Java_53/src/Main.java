import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Copy tham chieu -> Su dung dau =
        int [] mang1 = {1,2,3};
        int [] mang2 = mang1;
        //Thay doi ca 2 mang
        mang2[0] = 4;
        System.out.println(Arrays.toString(mang1));
        System.out.println(Arrays.toString(mang2));

        //C1: Copy mang moi (Khong lam thay doi)
        int [] mang3 = {1,2,3};
        int [] mang4 = mang3.clone();
        //Chi thay doi 1 mang
        mang3[0] = 4;
        System.out.println(Arrays.toString(mang3));
        System.out.println(Arrays.toString(mang4));


        //C2: Copy mang moi (Khong lam thay doi)
        int [] mang5 = {1,2,3};
        //int [] mang6 = Arrays.copyOf(mang5,5);
        int [] mang6 = new int [5];
        System.arraycopy(mang5, 0, mang6, 0, 3);
        mang6[0] = 4;
        System.out.println(Arrays.toString(mang5));
        System.out.println(Arrays.toString(mang6));

        //Mang doi tuong
        String [] mang7 = {"Hello","World"};
        String [] mang8 = mang7;
        mang8[0] = "How are you?";
        System.out.println(Arrays.toString(mang7));
        System.out.println(Arrays.toString(mang8));
        //C1
        String [] mang9 = {"Hello","World"};
        String [] mang10 = mang9.clone();
        mang10[0] = "How are you?";
        System.out.println(Arrays.toString(mang9));
        System.out.println(Arrays.toString(mang10));
        //C2
        String [] mang11 = {"Hello","World"};
        String [] mang12 = new String [mang11.length];
        System.arraycopy(mang11, 0, mang12, 0, mang11.length);
        mang12[0] = "How are you?";
        System.out.println(Arrays.toString(mang11));
        System.out.println(Arrays.toString(mang12));
    }
}
