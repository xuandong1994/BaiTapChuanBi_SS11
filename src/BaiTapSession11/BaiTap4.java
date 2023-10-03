package BaiTapSession11;

import java.util.Scanner;
import java.util.Stack;

public class BaiTap4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số lượng từ : ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Số lượng từ thứ " + (i+1) + "là : ");
            String word = scanner.nextLine();
            stack.push(word);
        }
        System.out.println("Các từ theo thứ tự đảo ngược : ");
        while (!stack.isEmpty()){
            String word = stack.remove(stack.size() - 1);
            System.out.println(word);
        }
    }
}
