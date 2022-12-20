import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[30];
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        rand(array);
        task1(array);
        task2(array);
        task3(array);
        task4(reverseFullName);

    }

    public static void rand(int[] array) {
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000) + 100000;
        }

    }


    public static void task1(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        int min = max;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3(int[] array) {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double midlSum = sum / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + midlSum + " rur");
    }

    public static void task4(char[] reversFullName) {
        char a = 0;
        for (int i = reversFullName.length-1; i >=0; i--) {
            System.out.print(reversFullName[i]);
        }

    }
}