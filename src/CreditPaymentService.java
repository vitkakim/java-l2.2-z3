public class CreditPaymentService {
    public double calculate(int credit, int creditTerm, double percent) {

        System.out.println("Сумма кредита = " + credit + " руб");
        System.out.println("Срок кредита = " + creditTerm + " г.");
        System.out.println("Процентная ставка = " + percent + "%");

        double percentInMonth = percent / (100 * 12);

        return credit * (percentInMonth / (1 - Math.pow(1 + percentInMonth, - (creditTerm * 12))));
    }

}
