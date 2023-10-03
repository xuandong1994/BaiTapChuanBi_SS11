package BaiTapSession11;

import java.util.Scanner;
import java.util.Stack;

public class BaiTap8P2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in );
        System.out.println("Mời nhập chuỗi");
        String input = scanner.nextLine();
        System.out.println("Chuỗi đảo ngược là : ");
        String reversedString = reverseString(input);
        System.out.println(reversedString);
    }

    private static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }
}
