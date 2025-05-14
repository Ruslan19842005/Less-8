public class Main {
    public static void main(String[] args) {

        int targetAmount = 2459000;
        int monthlyDeposit = 15000;
        int currentAmount = 0;
        int months = 0;
        while (currentAmount < targetAmount) {
            currentAmount += monthlyDeposit;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + currentAmount + " рублей");
        }
    }
}




































