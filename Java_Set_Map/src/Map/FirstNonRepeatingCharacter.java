package Map;

import java.util.HashMap;
import java.util.Set;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swiss";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            }else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (Character key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }
    }
}
