package com.payment.paymentservice.service;

import com.payment.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
