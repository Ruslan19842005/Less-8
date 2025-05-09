public class Main {
    public static void main(String[] args) {


        int desiredSum = 2459000;
        int sum = 0;
        int amount = 15000;
        int month = 0;
        while(sum < desiredSum){
            sum += amount;
            month++;
            System.out.println("Месяц " + month + "  сумма накоплений " + sum + " рублей ");
        }
    }
}