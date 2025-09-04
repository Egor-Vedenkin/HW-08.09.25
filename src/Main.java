//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int firstVar = 2_000_000;
        System.out.println("Значение переменной firstVar с типом int равно " + firstVar);
        byte secondVar = -7;
        System.out.println("Значение переменной secondVar с типом byte равно " + secondVar);
        short thirdVar = 30_000;
        System.out.println("Значение переменной thirdVar с типом short равно " + thirdVar);
        long fourthVar = 20_000_000_000_000L;
        System.out.println("Значение переменной fourthVar с типом long равно " + fourthVar);
        float fifthVar = 9.97f;
        System.out.println("Значение переменной fifthVar с типом float равно " + fifthVar);
        double sixthVar = 9.4;
        System.out.println("Значение переменной sixthVar с типом double равно " + sixthVar);
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 2
        float a = 27.12f;
        long b = 987_678_965_549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        // Задача 3
        int quantityStudentsL = 23;
        int quantityStudentsA = 27;
        int quantityStudentsE = 30;
        int paperLists = 480;
        int summaryStudents = quantityStudentsE + quantityStudentsL + quantityStudentsA;
        int listsPerStudents = paperLists / summaryStudents;
        System.out.println("На каждого ученика рассчитано " + listsPerStudents + " листов бумаги");
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 4
        int efficiency = 16;
        int effPerMin = efficiency / 2;
        int bottlesStart = effPerMin * 20;
        System.out.println("За 20 минут машина произвела " + bottlesStart + " штук бутылок");
        int bottlesPerDay = effPerMin * 60 * 24;
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        int bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 5
        int summaryPaints = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int whiteQuantity = summaryPaints / (whitePaintPerClass + brownPaintPerClass) * whitePaintPerClass;
        int brownQuantity = summaryPaints / (whitePaintPerClass + brownPaintPerClass) * brownPaintPerClass;
        int classesQuantity = whiteQuantity / whitePaintPerClass;
        System.out.println("В школе, где " + classesQuantity + " классов, нужно " + whiteQuantity + " банок белой краски и " + brownQuantity + " банок коричневой краски");
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 6
        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int weightGr = bananas + milk + iceCream + eggs;
        int grPerKg = 1000;
        float weightKg = weightGr / (float) grPerKg;
        System.out.println("Результат в граммах равен " + weightGr + ", а в килограммах - " + weightKg);
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 7
        short weightLessGr = 7 * 1000;
        int daysMax = weightLessGr / 250;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, то сбросит 7 кг за " + daysMax + " дней");
        int daysMin = weightLessGr / 500;
        System.out.println("Если спортсмен будет терять по 500 грамм в день, то сбросит 7 кг за " + daysMin + " дней");
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 8
        int mashaClaims = 67760;
        int denisClaims = 83690;
        int kristinaClaims = 76230;
        int mashaRaising = (int) (mashaClaims * 1.1);
        int denisRaising = (int) (denisClaims * 1.1);
        int kristinaRaising = (int) (kristinaClaims * 1.1);
        int mashaDiff = mashaRaising - mashaClaims;
        int denisDiff = denisRaising - denisClaims;
        int kristinaDiff = kristinaRaising - kristinaClaims;
        System.out.println("Маша теперь получает " + mashaRaising + " рублей. Годовой доход вырос на " + mashaDiff + " рублей");
        System.out.println("Денис теперь получает " + denisRaising + " рублей. Годовой доход вырос на " + denisDiff + " рублей");
        System.out.println("Кристина теперь получает " + kristinaRaising + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей");

    }
}