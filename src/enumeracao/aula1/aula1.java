package enumeracao.aula1;

import enumeracao.aula1.entities.Order;
import enumeracao.aula1.entities.enums.OrderStatus;

import java.util.Date;

public class aula1 {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
