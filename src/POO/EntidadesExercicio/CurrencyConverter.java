package POO.EntidadesExercicio;

public class CurrencyConverter {

    private double dollarPrice;

    public CurrencyConverter(double dollarPrice) {
        this.dollarPrice = dollarPrice;
    }

    public double calculateAmountInReais(double dollars) {
        double reais = dollars * dollarPrice;
        double iof = reais * 0.06;
        return reais + iof;
    }
}
