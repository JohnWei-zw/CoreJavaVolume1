package chapter6.lambda.demo1;

public class Demo1 {
    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }

    public static void main(String[] args) {
        repeat(10, i -> System.out.println("Countdown:" + (9 - i)));
    }
}
