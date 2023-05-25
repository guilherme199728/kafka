package com.payment.paymentservice.service.impl;

import com.payment.paymentservice.model.Payment;
import com.payment.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info(" PAYMENT_SERVICE_IMPL ::: Pagamento recebido {}", payment);
    }
}
