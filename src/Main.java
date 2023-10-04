import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task01();
    }

    private static void task04(int[] intArr) {
        for (int i =0; i < intArr.length; i++) {
            if (intArr[i] % 2 != 0) {
                intArr[i] = intArr[i] + 1;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(intArr));
    }

    private static void task03(int[] intArr, double[] doublesArr, boolean[] boolArr) {

        System.out.println();
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.print(intArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doublesArr.length - 1; i >= 0; i--) {
            System.out.print(doublesArr[i]);
            if (i > doublesArr.length - 3) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = boolArr.length - 1; i >= 0; i--) {
            System.out.print(boolArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

    }

    private static void task02(int[] intArr, double[] doublesArr, boolean[] boolArr) {
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            if (i < intArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doublesArr.length; i++) {
            System.out.print(doublesArr[i]);
            if (i < doublesArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < boolArr.length; i++) {
            System.out.print(boolArr[i]);
            if (i < boolArr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    private static void task01() {
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;

        double[] doublesArr = {1.57, 7.654, 9.986};

        boolean[] boolArr = {true, true, false};

        task02(intArr, doublesArr, boolArr);
        task03(intArr, doublesArr, boolArr);
        task04(intArr);
    }
}