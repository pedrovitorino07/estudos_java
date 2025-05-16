package heranca_polimorfismo.aula1.application;

import heranca_polimorfismo.aula1.entities.Account;
import heranca_polimorfismo.aula1.entities.SavingsAccount;

public class aula3 {
    public static void main(String[] args) {

        // POLIMORFISMO

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
