import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Задача 1");

        int salary = 15000;
        double total = 0;
        int month = 1;
        while (total < 2459000) {
            total *= 1.01;
            total += salary;
            String totalKopeyki = decimalFormat.format(total);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalKopeyki + " рублей");
            month++;
        }


        System.out.println();
        System.out.println("Задача 2");

        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }
        count--;
        System.out.println();
        for (; count >= 1; count--) {
            System.out.print(count + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задача 3");

        int population = 12_000_000;
        double birthRate = (double) 17 / 1000;
        double mortalityRate = (double) 8 / 1000;
        int populationChangePerYear = (int) (population * birthRate) - (int) (population * mortalityRate);
        int year = 0;
        while (year <= 10) {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            population += populationChangePerYear;
            year++;
        }

        System.out.println();
        System.out.println("Задача 4");


        double cashSavings = 15000;
        month = 1;
        while (cashSavings < 12_000_000) {
            cashSavings *= 1.07;
            String cashSavingsKopeyki = decimalFormat.format(cashSavings);
            System.out.println("Месяц " + month + " сумма накоплений равна " + cashSavingsKopeyki + " рублей");
            month++;
        }

        System.out.println();
        System.out.println("Задача 5");

        cashSavings = 15000;
        month = 1;
        while (cashSavings < 12_000_000) {
            cashSavings *= 1.07;
            String cashSavingsKopeyki = decimalFormat.format(cashSavings);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + cashSavingsKopeyki + " рублей");
            }
            month++;
        }

        System.out.println();
        System.out.println("Задача 6");

        int nineYears = 9 * 12;
        cashSavings = 15000;
        month = 1;
        while (month <= nineYears) {
            cashSavings *= 1.07;
            String cashSavingsKopeyki = decimalFormat.format(cashSavings);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + cashSavingsKopeyki + " рублей");
            }
            month++;
        }

        System.out.println();
        System.out.println("Задача 7");

        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println();
        System.out.println("Задача 8");

        year = 0;
        int beginningOfTheObservation = 2024 - 200;
        int endOfTheObservation = 2024 + 100;
        while (year <= endOfTheObservation) {
            if (year >= beginningOfTheObservation && year % 79 == 0) {
                System.out.println(year);
            }
            year++;
        }


    }
}