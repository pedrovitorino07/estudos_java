package Estrutura_condicional.Aula;

import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;
        System.out.println("Quantas horas?");

        hora = sc.nextInt();

        // || = ou
        // && = e
        // ! = não/diferente
        // if(condição){execução}
        // else{execução}
        if (hora < 12) {
        System.out.println("Bom dia!");
        }
        else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
