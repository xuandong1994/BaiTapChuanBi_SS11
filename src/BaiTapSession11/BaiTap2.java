package BaiTapSession11;

import java.util.Stack;

public class BaiTap2 {
    public static boolean isParenthesesValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if      ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "[()]{}{[()()]()})";
        boolean isValid = isParenthesesValid(input);

        if (isValid) {
            System.out.println("Chuỗi đúng");
        } else {
            System.out.println("Chuỗi sai");
        }
    }
}
