package ua.butsai.homework9;

/**
 * 2. Печать дней недели.
 *
 *  а) Напишите метод с именем printDayOfTheWeek, у которого есть один параметр с именем day и типом int.
 *  Метод не должен возвращать никакого значения (подсказка: void)
 *  Используя оператор switch, выведите "Понедельник", "Вторник", и т.д., "Воскресенье",
 *  если параметр int "day" равен 0, 1, и т.д., 6 соответственно,
 *  в противном случае метод должен вывести "Invalid day"
 *
 *  б) Напишите метод с именем printDayOfTheWeek, у которого есть один параметр с именем day и типом String.
 *  Метод должен выполнять тоже действие, используя if-then-else вместо использования switch.
 *  Для преобразования строки в число используйте метод Integer.parseInt()
 */
public class DayOfTheWeek {
    public static void main(String[] args) {

        printDayOfTheWeek(1);
        printDayOfTheWeek("5");

    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Понедельник");
                break;
            case 1:
                System.out.println("Вторник");
                break;
            case 2:
                System.out.println("Среда");
                break;
            case 3:
                System.out.println("Четверг");
                break;
            case 4:
                System.out.println("Пятница");
                break;
            case 5:
                System.out.println("Суббота");
                break;
            case 6:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayOfTheWeek(String day) {

        int days = Integer.parseInt(day);
        if (days == 0) {
            System.out.println("Понедельник");
        } else if (days == 1) {
            System.out.println("Вторник");
        } else if (days == 2) {
            System.out.println("Среда");
        } else if (days == 3) {
            System.out.println("Четверг");
        } else if (days == 4) {
            System.out.println("Пятница");
        } else if (days == 5) {
            System.out.println("Суббота");
        } else if (days == 6) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Invalid day");
        }
    }
}