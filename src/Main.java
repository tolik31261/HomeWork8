public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int [] number = new int [3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ", ");
        }
        System.out.println();


        double [] number2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i] + ", ");
        }
        System.out.println();

        double [] randomMassive = {23, 105.54, 646466.465454};
        for (int i = 0; i < randomMassive.length; i++) {
            System.out.print(randomMassive[i] + ", ");
        }
        System.out.println();



    }



}