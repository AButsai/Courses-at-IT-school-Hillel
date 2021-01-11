package ua.butsai.homework9;

/**
 * 1. Создайте новый консольный проект с названием: seconds-and-minutes
 *
 * Создайте метод с именем getDurationString с двумя параметрами: первый параметр кол-во минут (minutes) и второй параметр кол-во секунд (seconds).
 * Валидация входящих параметров: проверить, что первый параметр minutes >= 0, второй параметр seconds >= 0 и <= 59. Метод должен возвращать "Invalid value", если валидация не прошла.
 * Если значения параметров валидны, вычислите, сколько часов, минут и секунд равны минутам и секундам, переданным этому методу, и верните это значение в виде строки в формате "XXh YYm ZZs", где XX представляет количество часов, YY минуты и ZZ секунды.
 *
 * Создайте 2-й метод с тем же именем, но с одним параметром кол-во секунд (seconds). Проверьте, что seconds > = 0, и верните "Invalid value", если это не так. Если кол-во секунд верны, вычислите, сколько минут указано в значении секунд, затем вызовите другой перегруженный метод, передав минуты и секунды, рассчитанные для правильного вычисления.
 * Вызовите оба метода для вывода значений на консоль.
 * Подсказки: Используйте тип long для ваших числовых типов данных. 1 минута = 60 секунд и 1 час = 60 минут или 3600 секунд.
 * Методы должны быть статическими, как мы использовали ранее.
 */
public class SecondsAndMinutes {
    public static void main(String[] args) {

        String result1 = getDurationString(7);
        String result2 = getDurationString(234L, 56);
        System.out.println(result2);
        System.out.println(result1);
    }

    static String getDurationString(long minutes, long seconds) {

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            long hour = minutes / 60;
            long minute = minutes % 60;
            return String.format("%02dh %02dm %02ds", hour, minute, seconds);
        } else {
            return  "Invalid value";
        }
    }

    static String getDurationString(long seconds) {
        long minutes, second;
        if (seconds >= 0) {
            minutes = seconds / 60;
            second = seconds % 60;
        } else {
            return "Invalid value";
        }
        return getDurationString(minutes, second);
    }
}
