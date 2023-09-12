

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        var friend = 19;
        var frog = 3.5;
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        task1(dog, cat, paper);
        task2(dog, cat, paper);
        task3(dog, cat, paper);
        task4(friend);
        task5(frog);
        task6(boxerOneWeight, boxerTwoWeight);
        task7(boxerOneWeight, boxerTwoWeight);
        task8();
    }

    private static void task8() {
        var totalTime = 640;
        var timeWork = 8;
        var workers = totalTime / timeWork;
        var addWorkers = workers + 94;
        var timeForAllWorkers = totalTime / addWorkers;

        System.out.println("Всего работников в компании " + workers +  " человек");

        System.out.println("Если в компании работает " +addWorkers+ " человек, " +
                "то всего " + timeForAllWorkers + " часов работы может быть поделено между сотрудниками");
    }

    private static void task7(double boxerOneWeight, double boxerTwoWeight) {
        var weightDifference = boxerTwoWeight - boxerOneWeight;
        System.out.println(weightDifference);
        var weightDifferenceSec = boxerTwoWeight % boxerOneWeight;
        System.out.println(weightDifferenceSec);
    }

    private static void task6(double boxerOneWeight, double boxerTwoWeight) {
        var totalWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println(totalWeight);
        var weightDifference = boxerTwoWeight - boxerOneWeight;
        System.out.println(weightDifference);
    }

    private static void task5(double frog) {
        System.out.println(frog);
     frog = frog * 10;
        System.out.println(frog);
     frog = frog / 3.5;
        System.out.println(frog);
     frog = frog + 4;
        System.out.println(frog);
    }

    private static void task4(int friend) {
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    private static void task3(double dog, double cat, int paper) {
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        printVar(dog, cat, paper);
    }

    private static void printVar(double dog, double cat, int paper) {
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    private static void task2(double dog, double cat, int paper) {
        dog = dog + 2;
        cat = cat + 2;
        paper = paper + 2;
        printVar(dog, cat, paper);
    }

    private static void task1(double dog, double cat, int paper) {
        printVar(dog, cat, paper);
    }
}