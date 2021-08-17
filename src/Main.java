import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("");

        double payment1 = service.calculate(1_000_000, 1, 9.99);
        String str1 = String.format("Ежемесячный платеж = %.0f руб.", payment1);
        System.out.println(str1);

        System.out.println("");

        double payment2 = service.calculate(1_000_000, 2, 9.99);
        String str2 = String.format("Ежемесячный платеж = %.0f руб.", payment2);
        System.out.println(str2);

        System.out.println("");

        double payment3 = service.calculate(1_000_000, 3, 9.99);
        String str3 = String.format("Ежемесячный платеж = %.0f руб.", payment3);
        System.out.println(str3);

    }
}