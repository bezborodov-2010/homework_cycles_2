public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int money = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i = i + 1;
            total = total + total / 100;
            total = total + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 2");

        i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Задача 3");

        int peopleY = 12_000_000;
        int bornPeople = 17;
        int dethPeople = 8;
        int year = 0;

        while (year < 10) {
            year = year + 1;
            bornPeople = bornPeople * peopleY / 1000;
            dethPeople = dethPeople * peopleY / 1000;
            peopleY = peopleY + bornPeople - dethPeople;
            System.out.println("Год " + year + ", численность населения составляет " + peopleY);
        }
        System.out.println("Задача 4");

        money = 15000;
        total = 0;
        i = 0;
        while (total <= 12_000_000) {
            i = i + 1;
            total = total + total / 100 * 7;
            total = total + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 5");

        money = 15000;
        total = 0;
        i = 0;
        while (total <= 12_000_000) {
            i = i + 1;
            total = total + total / 100 * 7;
            total = total + money;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println("Задача 6");

        money = 15000;
        total = 0;
        i = 0;
        while (i <= 9 * 12) {
            i = i + 1;
            total = total + total / 100 * 7;
            total = total + money;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println("Задача 7");

        int dayFriday = 5;
        while (dayFriday <= 31) {
            System.out.println("Сегодня пятница, " + dayFriday + " -е число. Необходимо подготовить отчет");
            dayFriday = dayFriday + 7;
        }
        System.out.println("Задача 8");

        int startYear = 0;
        int startPrintYear = 1823;
        int finishPrintYear = 2123;
        while (startYear <= finishPrintYear) {
            startYear = startYear + 79;
            if (startYear % 79 == 0 && startYear >= startPrintYear && startYear<= finishPrintYear) {
                System.out.println(startYear);
            }

        }

    }
}