package ua.butsai.homework10;
/**
 * Рассчитать и вывести на экран индекс массы тела с использованием методов
 * Пример в файле res//homework10.pdf
 */

import java.util.*;

public class BodyMassIndex {
    static double calculateBodyMassIndex(double weight, double height) {
        return weight / (height * height);
    }

    static String interpretation(double calculateBodyMassIndex) {
        String bmi;
        if (calculateBodyMassIndex < 16) {
            bmi = "Severe underweight";
        } else if (calculateBodyMassIndex >= 16 && calculateBodyMassIndex < 18.5) {
            bmi = "Insufficient (deficit) body weight";
        } else if (calculateBodyMassIndex >= 18.5 && calculateBodyMassIndex < 25) {
            bmi = "Norm";
        } else if (calculateBodyMassIndex >= 25 && calculateBodyMassIndex < 30) {
            bmi = "Overweight (obesity)";
        } else if (calculateBodyMassIndex >= 30 && calculateBodyMassIndex < 35) {
            bmi = "Obesity";
        } else if (calculateBodyMassIndex >= 35 && calculateBodyMassIndex < 40) {
            bmi = "Sharp obesity";
        } else {
            bmi = "Very sharp obesity";
        }
        return bmi;
    }

    public static void printResult(String name, double weight, double height) {
        System.out.println("Name : " + name);
        System.out.println("Weight : " + weight);
        System.out.println("Height : " + height);
        System.out.println("Body mass index : " + interpretation(calculateBodyMassIndex(weight, height)));

    }

    public static class MainBMI {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter your name:");
            String name = scan.nextLine();
            System.out.println("Enter your weight:");
            double weight = scan.nextDouble();
            System.out.println("Enter your height:");
            double height = scan.nextDouble();

            System.out.println(BodyMassIndex.calculateBodyMassIndex(weight, height));
            
            BodyMassIndex.printResult(name, weight, height);
        }
    }
}

