public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int [] number = new int [3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(number[2]);

        double [] number2 = {1.57, 7.654, 9.986};
        System.out.println(number2[2]);

        double [] randomMassive = {23, 105.54, 646466.465454};
        System.out.println(randomMassive[0]);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int [] massive = new int [10];
        for (int index = 0; index < massive.length; index++) {
            if (index == massive.length - 1) {
                System.out.println(massive[index]);
                break;
            }
            System.out.println(massive[index]);
        }

    }

}