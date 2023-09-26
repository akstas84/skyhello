public class Main {
    public static void main(String[] args) {
//        task01();
//        task02();
//        task03();
//        task04();
//        task05();
//        task06();
//        task07();
//        task08();
//        task09();
        task10();
    }

    private static void task10() {
        int n;
        for (int i = 1; i <= 10; i++) {
            n = i * 2;
            System.out.print(n + " ");
        }
    }

    private static void task09() {
        int monthlySumm = 29000;
        int monthlyPercent;
        int depositAmount = 0;
        for (int i = 0; i < 12; i++) {
            monthlyPercent = monthlySumm * 1 / 100;
            depositAmount = depositAmount + monthlyPercent;
            System.out.println("Месяц " + monthlySumm + ", сумма накоплений равна " + depositAmount + " рублей");
        }
    }

    private static void task08() {
        int monthlyContribution = 29000;
        int amountSavings = 0;
        for (int i = 0; i < 12; i++) {
            amountSavings = amountSavings + monthlyContribution;
            System.out.println("Месяц " + monthlyContribution + ", сумма накоплений равна " + amountSavings + " рублей");
        }
    }

    private static void task07() {
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
    }

    private static void task06() {
        for (int i = 0; i < 100; i = i + 7) {
            System.out.print(i + " ");
        }
    }

    private static void task05() {
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    private static void task04() {
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
    }

    private static void task03() {
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.print(i + " ");
        }
    }

    private static void task02() {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    private static void task01() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}