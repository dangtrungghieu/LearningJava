package ViDu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "Xin chao cac ban, toi la Dang Trung Hieu";
        String []a = s1.split(" ");
        System.out.println(Arrays.toString(a));

        String s2 = "Xin chao cac ban, toi la Dang Trung Hieu. Lap trinh vien BE";
        String []b = s2.split("[.,]");
        System.out.println(Arrays.toString(b));
    }
}
