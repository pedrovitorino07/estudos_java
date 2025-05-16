package heranca_polimorfismo.aula1.application;

import heranca_polimorfismo.aula1.entities.Account;
import heranca_polimorfismo.aula1.entities.BusinessAccount;
import heranca_polimorfismo.aula1.entities.SavingsAccount;

public class aula2 {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
