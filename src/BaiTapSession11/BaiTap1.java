package BaiTapSession11;

import java.util.ArrayDeque;
import java.util.Queue;

public class BaiTap1 {
    public static void main(String[] args) {

        Queue<String> test = new ArrayDeque<>();
        test.offer("a");
        test.offer("b");
        test.offer("c");
        test.offer("a1");
        while (!test.isEmpty()){
            System.out.println(test.poll());
        }
    }
}
