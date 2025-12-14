package org.example.chapter10.controller;

import org.example.chapter10.exception.NotEnoughMoneyException;
import org.example.chapter10.model.ErrorDetails;
import org.example.chapter10.model.PaymentDetails;
import org.example.chapter10.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private static Logger logger =
            Logger.getLogger(PaymentController.class.getName());
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestBody PaymentDetails paymentDetails) {

        logger.info("Received payment " +
                paymentDetails.getAmount());

        return ResponseEntity
              .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }

//    @PostMapping("/payment")
//    public ResponseEntity<PaymentDetails> makePayment() {
//        PaymentDetails paymentDetails = paymentService.processPayment();
//        return ResponseEntity
//                .status(HttpStatus.ACCEPTED)
//                .body(paymentDetails);
//    }

//    @PostMapping("/payment")
//    public ResponseEntity<?> makePayment() {
//        try {
//            PaymentDetails paymentDetails =
//            paymentService.processPayment();
//            return ResponseEntity
//              .status(HttpStatus.ACCEPTED)
//                    .body(paymentDetails);
//        } catch (NotEnoughMoneyException e) {
//            ErrorDetails errorDetails = new ErrorDetails();
//            errorDetails.setMessage("Not enough money to make the payment.");
//            return ResponseEntity
//              .badRequest()
//                    .body(errorDetails);
//        }
//    }
}
