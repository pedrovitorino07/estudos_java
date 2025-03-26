package vetores_lista.entities;

public class employee {

    private Integer id;
    private String name;
    private Double salary;

    public employee() {

    }

    public employee(Integer id, String name, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(Double percentage) {
        salary += salary * percentage / 100.0;
    }
}
