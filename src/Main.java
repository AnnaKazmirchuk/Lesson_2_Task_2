public class Main {
    public static void main(String[] args) {

        int initialAccount = 300;
        int moneyPaid = 1300;

        if (moneyPaid >= 1000) {
            int bonus = moneyPaid / 100;
            int updatedAccount = initialAccount + moneyPaid + bonus;
            System.out.println("На вашем счету: " + updatedAccount);
            System.out.println("Бонусов на счету: " + bonus);
        } else {
            int bonus = 0;
            int updatedAccount = initialAccount + moneyPaid + bonus;
            System.out.println("На вашем счету: " + updatedAccount);
            System.out.println("Бонусов на счету: " + bonus);
        }


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}