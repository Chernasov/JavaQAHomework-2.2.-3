public class CreditPaymentService {
    public int calculute (int summa, int period, double percent) {
        double percentAtMonth = percent / 100 / 12;
        double koefOfPer = 1 + percentAtMonth;
        double koefOfPercent = Math.pow (koefOfPer, period);
        int payment = (int) ((int) summa * (percentAtMonth + (percentAtMonth / (koefOfPercent - 1))));
        return payment;
    }
}
