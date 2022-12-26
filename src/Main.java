import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int salaryTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            salaryTotal += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + salaryTotal + " рублей.");
    }
        public static void task2 () {
            System.out.println("Задача 2");
            int[] money = generateRandomArray();
            int salaryTotalMax = -1;
            for (final int current : money) {
                if (current > salaryTotalMax) {
                    salaryTotalMax = current;
                }
            }
                    int salaryTotalMin = 32767;
                    for (final int current : money) {
                        if (current < salaryTotalMin) {
                            salaryTotalMin = current;
                        }
                    }
                    System.out.println("Минимальная сумма трат за день составила " + salaryTotalMin + " рублей. Максимальная сумма трат за день составила " + salaryTotalMax + " рублей.");
        }
        public static void task3 () {
            System.out.println("Задача 3");
            int[] average = generateRandomArray();
            double totalNumber = 0d;
            double averageNumber = 0d;
            for (int i = 0; i < average.length; i++) {
                totalNumber += average[i];
                averageNumber = totalNumber / average.length;
            }
            System.out.println("Средняя сумма трат за месяц составила " + averageNumber + " рублей.");
        }

        public static void task4 () {
            System.out.println("Задача 4");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }


    }
}
