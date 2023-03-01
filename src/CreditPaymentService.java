public class CreditPaymentService {
    public int calculate (int creditPeriodYear, int creditAmountRoubles) {

        float interestRate = 9.99F; // процентная ставка
        float monthlyRate = interestRate / 12 / 100; // месячная ставка по кредиту
        double tempResult = Math.pow(1 + monthlyRate, creditPeriodYear * 12); // промежуточный результат

        // формула расчета ежемесячного платежа
        double monthlyPayment = creditAmountRoubles * monthlyRate * tempResult / (tempResult - 1);

        return (int) monthlyPayment;
    }
}
