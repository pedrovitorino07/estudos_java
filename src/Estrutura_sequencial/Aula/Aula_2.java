package Estrutura_sequencial.Aula;

import java.util.Scanner;

public class Aula_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //posibilita ler os dados de entrada

        int x;
        String s1, s2, s3;

        //sc.next()charAt(0); = char e posição da letra
        //sc.nextInt(); =  int
        //sc.nextDouble(); = double
        //sc.next(); = string
        //sc.nextLine(); = lê até a quebra de linha

        //nesse caso é preciso adicionar outro sc.nextLine();
        //para subir o enter já sendo apertado para declarar o X
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}