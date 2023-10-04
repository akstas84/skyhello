public class Main {
    public static void main(String[] args) {
        int[ ] arr = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        task01(arr);
        task02(arr);
        task03(arr);
        task04(reverseFullName);
    }

    private static void task04(char[] arr) {
        for (int i = arr.length -1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    private static void task03(int[] arr) {
     int sum = task01(arr);
     double average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+average+ " рублей");
    }

    private static void task02(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if(i > max){
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + min+ " рублей.");

    }

    private static int task01(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        return sum;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}