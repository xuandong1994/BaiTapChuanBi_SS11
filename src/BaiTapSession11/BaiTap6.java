package BaiTapSession11;

import java.util.Stack;

public class BaiTap6 {
    public static boolean kiemTra(String input) {
        Stack<Character> bstack  = new Stack<>();

        for (char sym: input.toCharArray()) {
            if (ktDauNgoacTrai(sym)){
                bstack.push(sym);
            }else if (ktDauNgoacPhai(sym)){
                if (bstack.isEmpty()){
                    return false;
                }
                char left = bstack.pop();
                if (!ktKhopDauNgoac(left,sym)){
                    return false;
                }
            }

        }
        return true;
    }
    public static boolean ktDauNgoacTrai(char sym){
        return sym == '(' || sym == '{' || sym == '[';
    }
    public static boolean ktDauNgoacPhai(char sym){
        return sym == ')' || sym == '}' || sym ==']';
    }
    public static boolean ktKhopDauNgoac (char left, char right){
        return (left == '(' && right == ')') ||
                (left == '{' && right == '}') ||
                (left == '[' && right == ']');
    }

    public static void main(String[] args) {
        String expression = "((2 + 3) * [5 - 4])";
        if (kiemTra(expression)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
