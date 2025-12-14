package org.example.chapter11.Controller;

import org.example.chapter11.feign.PaymentProxyRest;
import org.example.chapter11.feign.PaymentsProxy;
import org.example.chapter11.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsController {

    private final PaymentProxyRest paymentsProxy;

    public PaymentsController(PaymentProxyRest PaymentProxyRest) {
        this.paymentsProxy = PaymentProxyRest;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ) {
        return paymentsProxy.createPayment(payment);
    }


//  Open feign
//    private final PaymentsProxy paymentsProxy;
//
//    public PaymentsController(PaymentsProxy paymentsProxy) {
//        this.paymentsProxy = paymentsProxy;
//    }
//
//    @PostMapping("/payment")
//    public Payment createPayment(
//            @RequestBody Payment payment
//    ) {
//        String requestId = UUID.randomUUID().toString();
//        return paymentsProxy.createPayment(requestId, payment);
//    }
}
