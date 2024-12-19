package Estrutura_sequencial.Aula;

import java.util.Locale;

public class Aula_1 {
    public static void main(String[] args) {

        //print = print sem quebra de linha
        //println = print com quebra de linha
        //printf = print com variaveis direto
        //"" + x + "" = concatena
        //%s = string
        //%d = int
        //%.2f = float e indicar quantos números depois da virgula devem aparecer
        //%n ou \n = quebra de linha

        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.2f metros%n", x);
        System.out.printf("%s tem  %d anos e ganha R$ %.2f%n reais%n", nome, idade, renda);


    }
}
