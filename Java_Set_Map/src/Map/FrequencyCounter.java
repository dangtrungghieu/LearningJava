package Map;

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 2, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
