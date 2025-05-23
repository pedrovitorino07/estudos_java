package interfaces.exercicio.services;

import interfaces.exercicio.entities.Contract;
import interfaces.exercicio.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentServices onlinePaymentServices;

    public ContractService(OnlinePaymentServices onlinePaymentServices) {
        this.onlinePaymentServices = onlinePaymentServices;
    }

    public void processContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentServices.interest(basicQuota, i);
            double fee = onlinePaymentServices.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstalments().add(new Installment(dueDate, quota));
        }
    }
}
