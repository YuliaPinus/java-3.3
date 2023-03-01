public class Main {
    public static void main(String[] args) {

        CreditPaymentService monthlyPayment = new CreditPaymentService();

        System.out.println("Ежемесячный платеж для кредита в 1 000 000 руб на срок 1 год составит:");
        System.out.println(monthlyPayment.calculate(1, 1_000_000) + " руб");

        System.out.println();
        System.out.println("Ежемесячный платеж для кредита в 1 000 000 руб на срок 2 года составит:");
        System.out.println(monthlyPayment.calculate(2, 1_000_000) + " руб");

        System.out.println();
        System.out.println("Ежемесячный платеж для кредита в 1 000 000 руб на срок 3 года составит:");
        System.out.println(monthlyPayment.calculate(3, 1_000_000) + " руб");
    }
}
