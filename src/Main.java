public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte myMaxByte = 127;
        System.out.println("Значение переменной myMaxByte с типом byte равно " + myMaxByte);
        short myMaxShort = 32767;
        System.out.println("Значение переменной myMaxShort с типом short равно " + myMaxShort);
        int myMaxInt = 2147483647;
        System.out.println("Значение переменной myMaxInt с типом int равно " + myMaxInt);
        long myMaxLong = 9223372036854775807L;
        System.out.println("Значение переменной myMaxLong с типом long равно " + myMaxLong);
        float myMaxFloat = 3.4028235E38f;
        System.out.println("Значение переменной myMaxFloat с типом float равно " + myMaxFloat);
        double myMaxDouble = 1.7976931348623157E308;
        System.out.println("Значение переменной myMaxDouble с типом double равно " + myMaxDouble);

        // Задача 2
        float task2FirstFloat = 27.12f;
        long task2FirstLong = 987_678_965_549L;
        float task2SecondFloat = 2.786f;
        short task2FirstShort = 569;
        short task2SecondShort = -159;
        short task2ThirdShort = 27897;
        byte task2FirstByte = 67;

        // Задача 3
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short sheets = 480;
        int personalSheets = sheets/(LP + AS + EA);
        System.out.println("На каждого ученика рассчитано " + personalSheets +  " листов бумаги");

        // Задача 4
        byte performance = 16/2;

        byte firstInterval = 20; // 20 минут
        String firstIntervalText = "20 минут";
        int firstIntervalBottles = performance * firstInterval;
        System.out.println("За " + firstIntervalText + " машина произвела " + firstIntervalBottles + " штук бутылок");

        short secondInterval = 24*60; // считаем количество минут в сутках
        String secondIntervalText = "сутки";
        int secondIntervalBottles = performance * secondInterval;
        System.out.println("За " + secondIntervalText + " машина произвела " + secondIntervalBottles + " штук бутылок");

        int thirdInterval = 3*24*60; // считаем количество минут за 3 дня
        String thirdIntervalText = "3 дня";
        int thirdIntervalBottles = performance * thirdInterval;
        System.out.println("За " + thirdIntervalText + " машина произвела " + thirdIntervalBottles + " штук бутылок");

        int fourthInterval = 30*24*60; // считаем количество минут за месяц
        String fourthIntervalText = "месяц";
        int fourthIntervalBottles = performance * fourthInterval;
        System.out.println("За " + fourthIntervalText + " машина произвела " + fourthIntervalBottles + " штук бутылок");

        // Задача 5
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        byte jarsAll = 120;
        int classes = jarsAll / (whitePerClass+ brownPerClass);
        int whiteAll = whitePerClass * classes;
        int brownAll = brownPerClass * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteAll + " банок белой краски и " + brownAll + " банок коричневой краски");

        // Задача 6
        byte bananaMass = 80;
        byte bananaAmount = 5;
        byte milkMass = 105;
        byte milkAmount = 2;
        byte iceCreamMass = 100;
        byte iceCreamAmount = 2;
        byte eggMass = 70;
        byte eggAmount = 4;
        int breakfastMassGrams = bananaMass * bananaAmount + milkMass * milkAmount + iceCreamMass * iceCreamAmount + eggMass * eggAmount;
        float kilogramsInGrams = 0.001f;
        float breakfastMassKilograms = breakfastMassGrams * kilogramsInGrams;
        System.out.println("Масса завтрака равна " + breakfastMassGrams + " грамм (" + breakfastMassKilograms + " килограмм)");

        // Задача 7
        short minLossGrams = 250;
        short maxLossGrams = 500;
        byte toLoseKg = 7;
        short gramsInKilogram = 1000;
        int slowLoss = toLoseKg * gramsInKilogram / minLossGrams;
        int fastLoss = toLoseKg * gramsInKilogram / maxLossGrams;
        int avgLoss = (slowLoss + fastLoss) / 2;
        System.out.println("Если худеть по " + minLossGrams + " грамм, то потребуется " + slowLoss + " дней");
        System.out.println("Если худеть по " + maxLossGrams + " грамм, то потребуется " + fastLoss + " дней");
        System.out.println("Среднее количество дней для похудения - " + avgLoss);

        // Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int months = 12;
        float increase = 1.1f;
        float newSalaryMasha = salaryMasha * increase;
        float newSalaryDenis = salaryDenis * increase;
        float newSalaryKristina = salaryKristina * increase;
        float yearDiffMasha = (newSalaryMasha - salaryMasha) * months;
        float yearDiffDenis = (newSalaryDenis - salaryDenis) * months;
        float yearDiffKristina = (newSalaryKristina - salaryKristina) * months;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearDiffMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearDiffDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + yearDiffKristina + " рублей");
    }
}
