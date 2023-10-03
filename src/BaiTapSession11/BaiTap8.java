package BaiTapSession11;

import java.util.Scanner;
import java.util.Stack;

public class BaiTap8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Mời nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        reverseArray(array);
    }

    private static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
            System.out.print(array[i] + " ");
        }
    }
}

