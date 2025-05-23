package interfaces.solucao.entities;

public class vehicle {

    private String model;

    public vehicle(){
    }

    public vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
