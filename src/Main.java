
public class Main {
    public static void main(String[] args) {
        task01();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
        task08();
    }

    private static void task08() {
        int thisYear = 2023;
        int startYear = thisYear - 200;
        int finishYear = thisYear + 100;
        int cometEveryYears = 79;
        for(int i = 0; i < finishYear; i = i + cometEveryYears){
            if(i > startYear){
                System.out.println(i);
            }
        }
    }

    private static void task07() {
        int daysInMonth = 31;
        int friday = 1;
        int daysToNextFriday = 7;
        for (int i = 0; i < daysInMonth; i = i + daysToNextFriday) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + daysToNextFriday;
        }

    }

    private static void task06() {
        int deposit = 15000;
        int monthlyDepositWithPercent = 0;
        int monthly = 1;
        int wholeRangeContribution = 9 * 12;
        while (true) {
            monthlyDepositWithPercent = monthlyDepositWithPercent + (deposit * 7 / 100);
            if (monthly % 6 == 0) {
                System.out.println("Месяц " + monthly + ", сумма накоплений равна " + monthlyDepositWithPercent + " рублей");
            }
            monthly++;
            if (monthly == wholeRangeContribution) {
                break;
            }
        }
    }

    private static void task05() {
        int deposit = 15000;
        int monthlyDepositWithPercent = 0;
        int monthly = 1;
        while (true) {
            monthlyDepositWithPercent = monthlyDepositWithPercent + (deposit * 7 / 100);
            if (monthly % 6 == 0) {
                System.out.println("Месяц " + monthly + ", сумма накоплений равна " + monthlyDepositWithPercent + " рублей");
            }
            monthly++;
            if (monthlyDepositWithPercent >= 12000000) {
                break;
            }
        }
    }

    private static void task04() {
        int deposit = 15000;
        int monthlyDepositWithPercent = 0;
        int monthly = 1;
        while (true) {
            monthlyDepositWithPercent = monthlyDepositWithPercent + (deposit * 7 / 100);
            System.out.println("Месяц " + monthly + ", сумма накоплений равна " + monthlyDepositWithPercent + " рублей");
            monthly++;
            if (monthlyDepositWithPercent >= 12000000) {
                break;
            }
        }
    }

    private static void task03() {
        int populationCountry = 12000000;
        int birthRatePeople = 17;
        int deathRatePeople = 8;
        int naturalGrowthThousand = birthRatePeople - deathRatePeople;
        int naturalGrowthYear = (populationCountry / 1000) * naturalGrowthThousand;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Год " + i + ", численность населения составляет " + naturalGrowthYear);
            naturalGrowthYear = naturalGrowthYear + naturalGrowthYear;
        }
    }

    private static void task02() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
    }

    private static void task01() {
        int howManyMonth = 0;
        int monthlyContribution = 15000;
        int amountSavings = 0;
        int goalAmountSaving = 2459000;
        while (amountSavings != goalAmountSaving) {
            amountSavings = amountSavings + monthlyContribution;
            System.out.println("Месяц " + howManyMonth + ", сумма накоплений равна " + amountSavings + " рублей");
            if (amountSavings > goalAmountSaving) {
                break;
            }
            howManyMonth++;
        }
    }
}