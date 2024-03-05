public class Main {
    public static void main(String[] args) {

        // задание 1
        System.out.println("Задание 1");
        int accumulation = 0;
        int cash = 15000;
        int month = 0;
        while (accumulation < 2_459_000) {
            accumulation = accumulation + accumulation / 100;
            accumulation = accumulation + cash;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + accumulation + " рублей");
        }

        // задание 2
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i);
        }
        System.out.println();
        for (int q = 10; q >= 1; q--) {
            System.out.print(" " + q);
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int Y = 12_000_000;
        int year = 0;
        int birthRate = (Y / 1000) * 17;
        int mortality = (Y / 1000) * 8;
        int populationGrowth = birthRate - mortality;
        while (year <= 10) {
            year = year + 1;
            Y = Y + populationGrowth;
            System.out.println("Год " + year + ", численность населения составляет " + Y);
        }
        // Задание 4
        System.out.println("Задание 4");
        int cash4 = 15000;
        int accumulation4 = 0;
        int month4 = 0;
        while (accumulation4 < 12_000_000) {
            accumulation4 = accumulation4 + ((accumulation4 / 100) * 7);
            accumulation4 = accumulation4 + cash4;
            month4 = month4 + 1;
            if (accumulation4 > 12_000_000) {
                System.out.println(month4 + " месяцев нужнно");
            }
            System.out.println(accumulation4 + " Сумма накоплений на " + month4 + " месяц");
        }
        // Задание 5
        System.out.println("Задание 5");
        int month5 = 0;
        int cash5 = 15000;
        int accumulation5 = 0;
        while (accumulation5 < 12_000_000) {
            accumulation5 = accumulation5 + ((accumulation5 / 100) * 7);
            accumulation5 = accumulation5 + cash5;
            month5 = month5 + 1;
            if (month5 % 6 == 0) {
                System.out.println(accumulation5 + " Cумма накоплений на " + month5 + " месяц");
            }

        }
        // Задание 6
        System.out.println("Задание 6");
        int accumulation6 = 0;
        int cash6 = 15000;
        int month6 = 0;
        int time = 9 * 12;
        while (month6 <= time) {
            accumulation6 = accumulation6 + ((accumulation6 / 100) * 7);
            accumulation6 = accumulation6 + cash6;
            month6 = month6 + 1;
            if (month6 % 6 == 0) {
                System.out.println("месяц " + month6 + " cумма накоплений " + accumulation6);
            }

        }
        // Задание 7
        System.out.println("Задание 7");
        int friday = 4;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-e число. Необходимо подготовить отчет");
        }

        // Задание 8
        System.out.println("Задание 8");
        int year8 = 2024;
        int firstYear = year8 - 200;
        int lustYear = year8 + 100;
        while (lustYear >= firstYear) {
            firstYear = firstYear + 1;
            if (firstYear % 79 == 0) {
                System.out.println(firstYear);
            }


        }


    }


}





