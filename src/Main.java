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
            System.out.print(number + "");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + "");
        }


        int population = 12000000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2025;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * fertilityPerThousand / 1000 - population * mortalityPerThousand / 1000;
            System.out.print(" Год " + year + " численность населения составит " + population);
        }


    }
}



