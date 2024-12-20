package Estrutura_condicional.Exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("De que horas começou o jogo: ");
        int horaInicio = sc.nextInt();
        System.out.println("De que horas acabou o jogo: ");
        int horaFinal = sc.nextInt();

        int duracao;
        if(horaInicio < horaFinal){
            duracao = horaFinal - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " horas");

        sc.close();
    }
}
