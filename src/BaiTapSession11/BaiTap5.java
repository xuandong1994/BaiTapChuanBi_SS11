package BaiTapSession11;

import java.util.*;

public class BaiTap5 {
    public static boolean isPalindrome(String input){
        Queue<Character> queue  = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        // Đưa các ký tự trong chuỗi vào Queue và Stack
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.add(c);
        }
        // So sánh từng cặp phần tử lấy từ Queue và Stack
        while (!stack.isEmpty() && !queue.isEmpty()){
            char queueChar = queue.remove();
            char stackChar = stack.pop();
            if (queueChar != stackChar) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi : ");
        String string = scanner.nextLine();

        if (isPalindrome(string)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }
    }

}
