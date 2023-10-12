public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        task01(fullName);
        task02(fullName);
        task03();
    }

    private static void task03() {
        String fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + newFullName + ".");
    }

    private static void task02(String fullName) {
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task01(String fullName) {
        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }
}