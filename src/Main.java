

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task8() {
        int maryMSalary = 67760;
        int maryYSalary = maryMSalary * 12;
        int denisMSalary = 83690;
        int denisYSalary = denisMSalary * 12;
        int kristyMSalary = 76230;
        int kristyYSalary = kristyMSalary * 12;
        double maryNewMSalary = maryMSalary + maryMSalary * 0.1;
        double denisNewMSalary = denisMSalary + denisMSalary * 0.1;
        double kristyNewMSalary = kristyMSalary + kristyMSalary * 0.1;
        double maryNewYSalary = maryNewMSalary * 12;
        double denisNewYSalary = denisNewMSalary * 12;
        double kristyNewYSalary = kristyNewMSalary * 12;
        double maryYDiffSalary = maryNewYSalary - maryYSalary;
        double denisYDiffSalary = denisNewYSalary - denisYSalary;
        double kristyYDiffSalary = kristyNewYSalary - kristyYSalary;
        System.out.println("Маша теперь получает " + maryNewMSalary + " рублей. Годовой доход вырос на " + maryYDiffSalary + " рублей");
        System.out.println("Денис теперь получает " + denisNewMSalary + " рублей. Годовой доход вырос на " + denisYDiffSalary + " рублей");
        System.out.println("Кристина теперь получает " + kristyNewMSalary + " рублей. Годовой доход вырос на " + kristyYDiffSalary + " рублей");
    }

    private static void task7() {
        short goalKg = 7;
        int goalGr = goalKg * 1000;
        short oneDayPlanFrstGr = 250;
        short oneDayPlanScndGr = 500;
        int midPlane = goalGr / oneDayPlanFrstGr;
        int fastPlane = goalGr / oneDayPlanScndGr;
        System.out.println(midPlane);
        System.out.println(fastPlane);
    }

    private static void task6() {
        double kG = 1000;
        short milkGr = 105 * 2;
        short aceCreamGr = 100 * 2;
        short eggsGr = 4 * 70;
        int weightAfterMixGr = milkGr + aceCreamGr + eggsGr;
        double weightAfterMixKg = weightAfterMixGr / kG;
        System.out.println(weightAfterMixGr);
        System.out.println(weightAfterMixKg);
    }

    private static void task5() {
        byte totalCans = 120;
        byte whiteColorCans = 2;
        byte brownColorCans = 4;
        int classes = totalCans / (whiteColorCans + brownColorCans);
        int totalWhite = totalCans / 3 * 1;
        int totalBrown = totalCans - totalWhite;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhite + " банок белой  и " + totalBrown + " банок коричневой краски");
    }

    private static void task4() {
        byte oneMinutePr = 16 / 2;
        int twentyMinutePr = 20 * oneMinutePr;
        int dayPr = 1440 * oneMinutePr;
        int threeDayPr = (3 * 1440) * oneMinutePr;
        int monthPr = (30 * 1440) * oneMinutePr;
        System.out.println("За 20 минут машина произвела " + twentyMinutePr + " штук бутылок");
        System.out.println("За день машина произвела " + dayPr + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDayPr + " штук бутылок");
        System.out.println("За месяц машина произвела " + monthPr + " штук бутылок");
    }

    private static void task3() {
        byte lPStudents = 23;
        byte aSStudents = 27;
        byte eAStudents = 30;
        short shPaper = 480;
        int eachStPaper = shPaper / (lPStudents + aSStudents + eAStudents);
        System.out.println("На каждого ученика рассчитано " + eachStPaper + " листов бумаги");
    }

    private static void task2() {
        float fV = 27.12f;
        long lV = 987678965549L;
        double dV = 2.786;
        short ssV = 569;
        short sV = -159;
        int iV = 27897;
        byte bV = 67;
    }

    private static void task1() {
        int iV = 1231231231;
        byte bV = 127;
        short sV = 128;
        long lV = 1231231231;
        float fV = 123f;
        double dV = 123;
        System.out.println("Значение переменной iV с типом int равно " + iV + "");
        System.out.println("Значение переменной bV с типом byte равно " + bV + "");
        System.out.println("Значение переменной sV с типом short равно " + sV + "");
        System.out.println("Значение переменной lV с типом long равно " + lV + "");
        System.out.println("Значение переменной fV с типом float равно " + fV + "");
        System.out.println("Значение переменной dV с типом double равно " + dV + "");
    }
}