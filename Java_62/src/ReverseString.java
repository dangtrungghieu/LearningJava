import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine(); // dao nguoc -> LIFO
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

}
