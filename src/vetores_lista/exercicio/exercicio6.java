package vetores_lista.exercicio;

import vetores_lista.entities.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {

            System.out.println();
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            employee emp = new employee(id, name, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();

        employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            //list.get(pos).increaseSalary(percent);
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<employee> list, int id) {
        employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
