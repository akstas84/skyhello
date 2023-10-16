import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        short year = 2021;
        int currentYear = LocalDate.now().getYear();
        byte clientOSType = 0;
        short deliveryDistance = 19;
        thisYearIsLeap(year);
        printLinkInformation(clientOSType, currentYear);
        deliveryTime(deliveryDistance);
    }

        private static void deliveryTime(short deliveryDistance) {
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


    private static void printLinkInformation(byte clientOSType, int clientDeviceYear) {
        if(clientOSType == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientOSType == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOSType == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if(clientOSType == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void thisYearIsLeap(short year) {
        short startBeginningLeapYear = 1584;
        if(year > startBeginningLeapYear && (year % 4 == 0) || (year % 100 !=0) && (year % 400 == 0)){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

}