package ua.butsai.homework11;

/**
 * Задание 5. Шахматная доска.
 *
 * Напишите программу, которая создает строку, представляющую сетку 8 х 8,
 * используя для разделения строк символы новой строки. В каждой позиции
 * сетки стоит либо пробел, либо символ"#". Эти символы должны располагаться
 * в шахматном порядке.
 *
 * Если вы уже написали программу, которая генерирует этот узор, определите
 * переменную size = 8 и измените программу так, чтобы она работала для любого
 * size, выводя сетку заданных ширины и высоты.
 */
public class ChessBoard {
    public static void main(String[] args) {

        System.out.println(chess(8,8));
    }

    public static String chess( int height, int weight) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                if ((i + j) % 2 == 0) {
                    stringBuilder.append(' ');
                } else {
                    stringBuilder.append('#');
                }
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
