package ua.butsai.homework5;

/**
 * Напишите программу, которая получает символ (кодовую точку Unicode) по 1, 3 и 9 индексу в строке.
 * Воспользуйтесь методом codePointAt() в классе String.
 *
 * Например для строки "Ура! Java!" необходимо получить в консоле следующее:
 *  Character(at index 1) = 1088
 *  Character(at index 3) = 33
 *  Character(at index 9) = 33
 */
public class Symbol {
   public static void main(String[] args) {

      String s = "Ура! Java!";

      int n, i, a;
      n = s.codePointAt(1);
      i = s.codePointAt(3);
      a = s.codePointAt(9);

      System.out.println("Character(at index 1) = " + n);
      System.out.println("Character(at index 3) = " + i);
      System.out.println("Character(at index 9) = " + a);
   }
}
