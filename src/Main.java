public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int savings = 15000;
        int total = 0;
        int i = 1;
        while (total < 245900) {
            total += savings;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " рублей");
            i++;
        }
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(" " + start);
            start++;
        }
        System.out.println();
        for (int a = 10; a > 0; a--) {
            System.out.print(" " + a);
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12000000;
        int fertility = 17;
        int mortality = 8;
        int growth = 0;
        for (int b = 1; b <= 10; b++) {
            growth = population * (fertility - mortality) / 1000;
            population += growth;
            System.out.println("Год " + b + ", численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        float contribution = 15000f;
        float percent = 0.07f;
        int month = 1;
        while (contribution <= 12_000_000) {
            contribution += contribution * percent;
            System.out.println("Месяц " + month + " накопления составляют " + contribution + " рублей.");
            month++;
        }
        System.out.println("Задача 5");
        float contributioN = 15000f;
        float percenT = 0.07f;
        int montH = 1;
        while (contributioN <= 12_000_000) {
            contributioN += contributioN * percenT;
            if (montH % 6 == 0) {
                System.out.println("Месяц " + montH + " накопления составляют " + contributioN + " рублей.");
            }
            if (contributioN > 12_000_000) {
                break;
            }
            montH++;
        }
        System.out.println("Целевая сумма накоплений достигнута за " + montH + " месяцев.");
        System.out.println("Задача 6");
        float contriBution = 15000f;
        float perCent = 0.07f;
        for (int year = 1; year <= 9; year++) {
            for (int moNth = 1; moNth <= 12; moNth++) {
                contriBution += contriBution * perCent;
                if (moNth % 6 == 0) {
                    System.out.println("Накопления сотавляют " + contriBution);
                }
            }
        }
        System.out.println("Задача 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчёт.");
            friday += 7;
        }
        System.out.println("Задача 8");
        int ourdayS = 2025;
        int sTart = ourdayS - 200;
        int future = ourdayS + 100;
        while (sTart <= future) {
            if(sTart%79==0)
            {
                System.out.println("Год появления кометы " + sTart);
            }
            sTart++;
        }
    }
}

