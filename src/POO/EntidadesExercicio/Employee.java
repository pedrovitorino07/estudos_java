package POO.EntidadesExercicio;

public class Employee {

    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public double IncreaseSalary(double percentage){
        return GrossSalary += GrossSalary * percentage / 100.0 ;
    }

    public String toString(){
        return Name + ", $ " + String.format("%.2f", NetSalary());
    }
}
