package microservices.controller;

import microservices.exception.OrderNotFoundException;
import microservices.model.Order;
import microservices.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

   /* @GetMapping("/hello")
    public String hello() {
        return "hello";
    }*/

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrder(@PathVariable String orderId) {

        if ("999".equals(orderId)) {
           throw new OrderNotFoundException("Order not found with id: " + orderId);
        }

        return ResponseEntity.ok(
                new Order(orderId, "Order " + orderId,
                        new Product("123", "Product", 100.0)));

    }
}
