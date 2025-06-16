package microservices.controller;

import microservices.model.Order;
import microservices.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {


    public ResponseEntity<Order> getOrder(String orderId) {
        if ("999".equals(orderId)) {
            System.out.println("Order not found with id: " + orderId);
        }

        return ResponseEntity.ok(
                new Order(orderId, "Order " + orderId,
                        new Product("123", "Product", 100.0)));

    }
}
