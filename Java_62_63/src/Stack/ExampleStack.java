package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ExampleStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(Check(str));
    }

    public static boolean Check(String str) {
        Deque<Character> deque = new ArrayDeque<Character>();
        //Doc vao Stack
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                deque.push(c);
            } else {
                if (deque.isEmpty()) {
                    return false;
                }else {
                    if (c == ')' && deque.peek() == '(') {
                        deque.pop();
                    }else if (c == ']' && deque.peek() == '[') {
                        deque.pop();
                    } else if (c == '}' && deque.peek() == '{') {
                        deque.pop();
                    } else{
                        return false;
                    }
                }
            }
        }
        return deque.isEmpty();
    }
}
