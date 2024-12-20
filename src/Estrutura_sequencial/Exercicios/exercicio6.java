package Estrutura_sequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario;
        int horaTrabalhada;
        Double valorHora, salario;

        numeroFuncionario = sc.nextInt();
        horaTrabalhada = sc.nextInt();
        valorHora = sc.nextDouble();
        salario = horaTrabalhada * valorHora;

        System.out.println("Number = " + numeroFuncionario);
        System.out.printf("Salary = U$%.2f", salario);

        sc.close();
    }
}
