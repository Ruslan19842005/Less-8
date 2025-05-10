public class Main {
    public static void main(String[] args) {


        int desiredSum = 2459000;
        int sum = 0;
        int amount = 15000;
        int month = 0;
        while (sum < desiredSum) {
            sum += amount;
            month++;
            System.out.println("Месяц " + month + "  сумма накоплений " + sum + " рублей ");
        }


        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }


        int population = 12000000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYearYear = 2025;
        for (int year = currentYearYear; year < currentYearYear + 10; year++) {
            population += population * fertilityPerThousand / 1000 - population * mortalityPerThousand / 1000;
            System.out.println("Год " + year + " численность населения составит " + population);
        }


        double savings = 15000;
        int months = 0;
        while (savings < 12000000) {
            savings *= 1.07;
            months++;
            System.out.println("Месяц " + months + ", сумма: " + savings);
        }


        savings = 15000;
        months = 0;
        while (savings < 12000000) {
            savings *= 1.07;
            savings += 15000;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма: " + savings);
            }


        }
    }
}


































