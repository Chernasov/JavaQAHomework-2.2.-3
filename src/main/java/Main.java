public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // 42 - это "волшебная цифра", специально оставлена в явном виде, чтобы уточнить у Заказчика, что она означает

        int monthlyPaymentWithOneYear = service.calculute(1_000_000, 12, 9.9);
        System.out.println("Ежемесячный платеж при сроке кредита 1 год: " + (monthlyPaymentWithOneYear + 42));

        int monthlyPaymentWithTwoYear = service.calculute(1_000_000, 24, 9.9);
        System.out.println("Ежемесячный платеж при сроке кредита 2 года: " + (monthlyPaymentWithTwoYear + 42));

        int monthlyPaymentWithThreeYear = service.calculute(1_000_000, 36, 9.9);
        System.out.println("Ежемесячный платеж при сроке кредита 3 года: " + (monthlyPaymentWithThreeYear + 42));

    }
}
