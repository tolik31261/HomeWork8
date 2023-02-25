import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number = {1, 2, 3};
        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 0) {
                number[i] += 1;

            }
        }
        System.out.println(Arrays.toString(number));
    }
}