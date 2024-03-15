package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bubblegumEarning = 202.0;
        double tofeeEarning = 118.0;
        double iceCreamEarning = 2250.0;
        double milkChocolateEarning = 1680.0;
        double doughnutEarning = 1075.0;
        double pancakeEarning = 80.0;
        double income = bubblegumEarning + tofeeEarning + iceCreamEarning + milkChocolateEarning + doughnutEarning + pancakeEarning;
        double netIncome;
        double staffExpenses;
        double otherExpenses;


        System.out.println("Earned amount:");
        System.out.println("Bubblegum: " + bubblegumEarning);
        System.out.println("Toffee: " + tofeeEarning);
        System.out.println("Ice cream: " + iceCreamEarning);
        System.out.println("Milk chocolate: " + milkChocolateEarning);
        System.out.println("Doughnut: " + doughnutEarning);
        System.out.println("Pancake: " + pancakeEarning);
        System.out.println();
        System.out.println("Income: " + income);
        System.out.println("Staff expenses:");
        staffExpenses = scanner.nextDouble();
        System.out.println("Other expenses:");
        otherExpenses = scanner.nextDouble();
        netIncome = income - staffExpenses - otherExpenses;
        System.out.println("Net income: " + netIncome);
    }
}