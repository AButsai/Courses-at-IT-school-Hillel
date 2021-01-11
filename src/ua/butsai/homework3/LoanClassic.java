package ua.butsai.homework3;
/**
 * 2) погашения кредита дифференцированными платежами
 * Пример в файле res//homework3.pdf
 */

import java.util.Scanner;

public class LoanClassic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите сумму кредита:");
        int sum = scan.nextInt();

        System.out.println("Введите срок кредита:");
        int numberOfYears = scan.nextInt();

        System.out.println("Годовая процентная ставка: 22%.");
        System.out.println();

        double tc = (double) sum/numberOfYears;

        double rp1 = (double) (sum/100*22)/12;
        double rp2 = ((sum-tc)/100*22)/12;
        double rp3 = ((sum-tc*2)/100*22)/12;
        double rp4 = ((sum-tc*3)/100*22)/12;
        double rp5 = ((sum-tc*4)/100*22)/12;
        double rp6 = ((sum-tc*5)/100*22)/12;
        double rp7 = ((sum-tc*6)/100*22)/12;
        double rp8 = ((sum-tc*7)/100*22)/12;
        double rp9 = ((sum-tc*8)/100*22)/12;
        double rp10 = ((sum-tc*9)/100*22)/12;
        double rp11 = ((sum-tc*10)/100*22)/12;
        double rp12 = ((sum-tc*11)/100*22)/12;

        double sp = rp1 + rp2 + rp3 + rp4 + rp5 + rp6 + rp7 + rp8 + rp9 + rp10 + rp11 + rp12;




        System.out.println("Сумма, которая идёт на погашение тела кредита = " + tc);
        System.out.println();

        System.out.println("1 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp1);
        System.out.println("2 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp2);
        System.out.println("3 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp3);
        System.out.println("4 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp4);
        System.out.println("5 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp5);
        System.out.println("6 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp6);
        System.out.println("7 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp7);
        System.out.println("8 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp8);
        System.out.println("9 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp9);
        System.out.println("10 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp10);
        System.out.println("11 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp11);
        System.out.println("12 расчетный период. Сумма, которая идет на погошение процентов по кредиту = " + rp12);

        System.out.println("Сумма переплаты за 12 месецев = " + sp);

    }
}
