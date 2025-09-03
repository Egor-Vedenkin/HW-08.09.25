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
        float var1 = 27.12f;
        long var2 = 987_678_965_549L;
        float var3 = 2.786f;
        short var4 = 569;
        short var5 = -159;
        short var6 = 27897;
        byte var7 = 67;

        // Задача 3
        var quantityStudentsL = 23;
        var quantityStudentsA = 27;
        var quantityStudentsE = 30;
        var summaryStudents = quantityStudentsE + quantityStudentsL + quantityStudentsA;
        var paperLists = 480;
        var listsPerStudents = paperLists / summaryStudents;
        System.out.println("На каждого ученика рассчитано " + listsPerStudents + " листов бумаги");
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 4
        var efficiency = 16;
        var effPerMin = efficiency / 2;
        var bottlesPer20 = effPerMin * 20;
        System.out.println("За 20 минут машина произвела " + bottlesPer20 + " штук бутылок");
        var bottlesPerDay = effPerMin * 60 * 24;
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        var bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        var bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 5
        var summaryPaints = 120;
        var whitePaintPerClass = 2;
        var brownPaintPerClass = 4;
        var whiteQuantity = summaryPaints / (whitePaintPerClass + brownPaintPerClass) * whitePaintPerClass;
        var brownQuantity = summaryPaints / (whitePaintPerClass + brownPaintPerClass) * brownPaintPerClass;
        var classesQuantity = whiteQuantity / whitePaintPerClass;
        System.out.println("В школе, где " + classesQuantity + " классов, нужно " + whiteQuantity + " банок белой краски и " + brownQuantity + " банок коричневой краски");
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 6
        var bananas = 5 * 80;
        var milk = 200 / 100 * 105;
        var iceCream = 2 * 100;
        var eggs = 4 * 70;
        var weightGr = bananas + milk + iceCream + eggs;
        int grPerKg = 1000;
        float weightKg = weightGr / (float) grPerKg;
        System.out.println("Результат в граммах равен " + weightGr + ", а в килограммах - " + weightKg);
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 7
        var weightLessGr = 7 * 1000;
        var daysMax = weightLessGr / 250;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, то сбросит 7 кг за " + daysMax + " дней");
        var daysMin = weightLessGr / 500;
        System.out.println("Если спортсмен будет терять по 500 грамм в день, то сбросит 7 кг за " + daysMin + " дней");
        // Отступ для визуального разделения задач
        System.out.println();

        // Задача 8
        int MashaClaims = 67760;
        int DenisClaims = 83690;
        int KristinaClaims = 76230;
        int MashaRaising = (int) (MashaClaims * 1.1);
        int DenisRaising = (int) (DenisClaims * 1.1);
        int KristinaRaising = (int) (KristinaClaims * 1.1);
        int MashaDiff = MashaRaising - MashaClaims;
        int DenisDiff = DenisRaising - DenisClaims;
        int KristinaDiff = KristinaRaising - KristinaClaims;
        System.out.println("Маша теперь получает " + MashaRaising + " рублей. Годовой доход вырос на " + MashaDiff + " рублей");
        System.out.println("Денис теперь получает " + DenisRaising + " рублей. Годовой доход вырос на " + DenisDiff + " рублей");
        System.out.println("Кристина теперь получает " + KristinaRaising + " рублей. Годовой доход вырос на " + KristinaDiff + " рублей");

    }
}