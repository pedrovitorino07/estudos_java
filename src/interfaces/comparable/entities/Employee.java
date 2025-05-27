package interfaces.comparable.entities;

public class Employee implements Comparable<Employee>{

    private String name;
    private Double salary;

    public Employee(Double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return -salary.compareTo(other.getSalary());
    }
}
