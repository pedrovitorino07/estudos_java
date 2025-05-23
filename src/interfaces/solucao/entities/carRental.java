package interfaces.solucao.entities;

import java.time.LocalDateTime;

public class carRental {

    private LocalDateTime start;
    private LocalDateTime finish;

    private vehicle vehicle;
    private invoice invoice;

    public carRental() {
    }

    public carRental(LocalDateTime start, vehicle vehicle, LocalDateTime finish) {
        this.start = start;
        this.vehicle = vehicle;
        this.finish = finish;

    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(invoice invoice) {
        this.invoice = invoice;
    }
}
