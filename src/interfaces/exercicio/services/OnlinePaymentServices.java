package interfaces.exercicio.services;

public interface OnlinePaymentServices {

    double paymentFee (double amount);
    double interest (double amount, int months);
}
