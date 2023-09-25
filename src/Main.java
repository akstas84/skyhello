public class Main {
    public static void main(String[] args) {
        byte clientOS = 1;
        short clientDeviceYear = 2014;
        short deliveryDistance = 95;
        short year = 2020;
        String monthNumber = "12";
        task01(clientOS);
        task02(clientOS, clientDeviceYear);
        task03(year);
        task04(deliveryDistance);
        task05(monthNumber);
    }

    private static void task05(String monthNumber) {
        short monthsPerYear = 12;
        if(Integer.parseInt(monthNumber) <= monthsPerYear){
            switch (monthNumber) {
                case "01": System.out.println("Январь"); break;
                case "02": System.out.println("Февраль"); break;
                case "03": System.out.println("Март"); break;
                case "04": System.out.println("Апрель"); break;
                case "05": System.out.println("Май"); break;
                case "06": System.out.println("Июнь"); break;
                case "07": System.out.println("Июль"); break;
                case "08": System.out.println("Август"); break;
                case "09": System.out.println("Сентябрь"); break;
                case "10": System.out.println("Октябрь"); break;
                case "11": System.out.println("Ноябрь"); break;
                case "12": System.out.println("Декабрь"); break;
            }
        }
    }

    private static void task04(short deliveryDistance) {
        if(isBetween(deliveryDistance, (short) 0, (short) 19)){
            System.out.println("Потребуется дней: 1");
        } else if (isBetween(deliveryDistance, (short) 20, (short) 59)) {
            System.out.println("Потребуется дней: 2");
        } else if (isBetween(deliveryDistance, (short) 60, (short) 100)) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static boolean isBetween(short deliveryDistance, short lower, short upper){
        return lower <=deliveryDistance && upper >=deliveryDistance;
    }

    private static void task03(short year) {
        short startBeginningLeapYear = 1584;
        if(year > startBeginningLeapYear && (year % 4 == 0) || (year % 100 !=0) && (year % 400 == 0)){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task02(byte clientOS, short clientDeviceYear) {
        if(clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if(clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task01(byte clientOS) {
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }
}