package ViDu;

import java.util.Arrays;

public class Main {
    public static int[] revert(int[] a){
        int []result = new int[a.length];
        int index = 0;
        for(int i = a.length - 1;i >= 0 ;i--){
            result[index] = a[i];
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        int [] a = new int []{1,8,2,6,4,3,7,9};
        int [] b = new int [15];
        //Ham sap xep tang dan
        Arrays.sort(a);
        System.out.println("Mang a sau khi sap xep tang dan: " + Arrays.toString(a));
        //Ham tim kiem BinarySearch (chi tim kiem duoc khi mang sx giam dan)
        System.out.println(Arrays.binarySearch(a, 4));
        System.out.println(Arrays.binarySearch(a, -1));
        //Ham dien tat ca cac gia tri cua 1 mang thanh 1 so
        Arrays.fill(b,5);
        System.out.println(Arrays.toString(b));

        //Sx giam dan
        a = revert(a);
        System.out.println(Arrays.toString(a));
    }
}
