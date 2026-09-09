package Map;

import java.util.HashMap;
import java.util.HashSet;

public class MiniInterview {
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 4, 3, 2};
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        }
//        boolean vaild = false;
//        for (int i = 0; i < nums.length; i++) {
//            if(map.get(nums[i]) > 1){
//                System.out.println(nums[i]);
//                vaild = true;
//                break;
//            }
//        }
//        if(!vaild){
//            System.out.println(-1);
//        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
                System.out.println(nums[i]);
                return;
            }else{
                set.add(nums[i]);
            }
        }
        System.out.println(-1);
    }
}
