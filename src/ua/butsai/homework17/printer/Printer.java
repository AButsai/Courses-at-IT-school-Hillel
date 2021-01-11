package ua.butsai.homework17.printer;

public class Printer {

    private double tonerLevel;
    private int printList;
    private boolean duplex;

    public Printer(double toner, int list, boolean duplex) {

        this.tonerLevel = toner;
        this.printList = list;
        this.duplex = duplex;
    }

    /*
    Проверяем уровень тонера.
    Добавляем если есть необходимость.
     */
    public double tonerFilling() {

        if (tonerLevel > 5 && tonerLevel <= 100) {
            return this.tonerLevel;
        } else {
            return this.tonerLevel = 100;
        }
    }

    /*
    Вычисляем количество листов для печати переданных строниц.
     */
    public int printPage(int page) {
        int list = 0;
        if (page <= 0) {

        }
        if (duplex) {
            if (page % 2 == 1) {
                list = page / 2 + 1;
            } else {
                list = page / 2;
            }
        } else {
            list = page;
        }
        return list;
    }

    /*
      Вычисляем количество тонера на печать заданных строниц
      с расчетом 0,05% тонера на одну строницу.
     */
    public double tonerConsumption(int page) {
        return this.tonerLevel - page * 0.05;
    }

    public void printResult() {

        if (MainPrinter.PAGE <= 0) {
            System.out.println("Некорректное количество строниц: ");
        } else {
            System.out.println("Проверяем есть ли тонер в принтере:\nТонер в принтере: " + tonerFilling() + "%\nПроверяем хватает ли количество листов для печати " + MainPrinter.PAGE + " строниц");
            if (this.printList < printPage(MainPrinter.PAGE)) {
                System.out.println("В принтере не хватает листов для печати " + MainPrinter.PAGE + " строниц. Добавьте бумагу!\n");
            } else {
                System.out.println("Листов хвотает, в принтере " + this.printList + " лист(ов)\nКоличество напечатоных листов = " + printPage(MainPrinter.PAGE) + "\nОстаток листов после печати " + MainPrinter.PAGE + " строниц = " + (this.printList - printPage(MainPrinter.PAGE)) + " лист(ов)\nОстаток тонера после печати " + MainPrinter.PAGE + " строниц = " + tonerConsumption(MainPrinter.PAGE) + "%\n");
            }
        }
    }
}


