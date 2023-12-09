public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        // Далее пишем код для задачи
        System.out.println("Задание 1");
        int summa = 0;
        for (int salary : arr) {
            summa += salary;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");
    }


    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int spend: arr) {
            if (spend < min) {
                min = spend;
            }
            if (spend > max) {
                max = spend;
            }
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int summa = 0;
       // double averageSum = 0;
        for (int salary : arr) {
            summa += salary;
        }
        double averageSum = (double) summa / arr.length;
        System.out.println(averageSum);
    }


    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    }
