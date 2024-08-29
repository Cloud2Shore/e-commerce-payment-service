package cloud.shore.paymentservice.controller;

import cloud.shore.paymentservice.model.PaymentDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping("/pay/{orderId}")
    public boolean processPayment(@PathVariable("orderId") String orderId, @RequestBody PaymentDetails paymentDetails) {
        // Simulate payment processing
        return true; // Assume payment is successful
    }
}