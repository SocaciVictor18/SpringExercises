package org.example.chapter10.service;

import org.example.chapter10.exception.NotEnoughMoneyException;
import org.example.chapter10.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
