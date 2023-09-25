public class Main {
    public static void main(String[] args) {
        int age = 5;
        int temp = 5;
        int speed = 60;
        int peopleCount = 60;
        boolean childAccompaniedByAdult = false;
        int one = 4;
        int two = 2;
        int three = 3;
//        task01(age);
//        task02(temp);
//        task03(speed);
        task04(age);
        task05(age, childAccompaniedByAdult);
        task06();
//        task07(one, two, three);
    }

    private static void task07(int one, int two, int three) {
        if (one > two && one > three) {
            System.out.println("Число " + one + " большее");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " большее");
        } else {
            System.out.println("Число " + three + " большее");
        }
    }

    private static void task06() {
        short allPlaces = 102;
        short seatingPlaces = 60;
        short occupiedSeatsPlaces = 30;
        short occupiedStandingPlaces = 40;
        int freeSeats;
        int freeStandingPlaces;
        if(occupiedSeatsPlaces > 0) {
            freeSeats = seatingPlaces - occupiedSeatsPlaces;
            System.out.println("Сидячих мест в вагоне: " + freeSeats);
        }
        if (occupiedStandingPlaces > 0) {
            freeStandingPlaces = (allPlaces - seatingPlaces) - occupiedStandingPlaces;
            System.out.println("Стоячих мест в вагоне: " + freeStandingPlaces);
        }
    }

    private static void task05(int age, boolean childAccompaniedByAdult) {
        if (age < 5) {
            System.out.println("Если возраст ребенка равен" + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            if (!childAccompaniedByAdult) {
                System.out.println("Без сопровождения взрослого кататься нельзя");
            } else{
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            }
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему без сопровождения взрослого");
        }
    }

    private static void task04(int age) {
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }

    private static void task03(int speed) {
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
    }

    private static void task02(int temp) {
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    private static void task01(int age) {
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он достиг совершеннолетия");
        }
    }
}