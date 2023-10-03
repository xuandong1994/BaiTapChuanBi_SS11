package BaiTapSession11;

import java.util.Stack;

public class BaiTap10 {
    public static int calculate(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                if (stack.size() < 2) {
                    // Biểu thức không hợp lệ
                    return -1;
                }
                int b = stack.pop();
                int a = stack.pop();
                stack.push(performOperation(a, b, c));
            }
        }

        if (stack.size() != 1) {
            // Biểu thức không hợp lệ
            return -1;
        }
        return stack.pop();
    }

    private static int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Toán tử không hợp lệ");
        }
    }

    public static void main(String[] args) {
        String expression = "1 + 2 * 3 - 4";
        System.out.println(calculate(expression));
    }
}