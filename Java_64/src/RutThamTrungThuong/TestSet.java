package RutThamTrungThuong;

import java.util.Arrays;
import java.util.HashSet;

public class TestSet {
    public static void main(String[] args) {
        int [] a = new int []{1,2,3,4,5,5,6,6,7,8,8,9,9,9,9,10,10};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println(Arrays.toString(set.toArray()));
    }
}
