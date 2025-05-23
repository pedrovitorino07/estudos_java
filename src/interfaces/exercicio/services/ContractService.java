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
        contract.getInstalments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
        contract.getInstalments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));
    }
}
