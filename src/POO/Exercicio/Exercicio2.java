package POO.Exercicio;

import POO.EntidadesExercicio.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee emp = new Employee();

        System.out.printf("Name: ");
        emp.Name = sc.nextLine();
        System.out.printf("Gross salary: ");
        emp.GrossSalary = sc.nextDouble();
        System.out.printf("Tax: ");
        emp.Tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);
        sc.close();
    }
}
