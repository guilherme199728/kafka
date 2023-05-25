package com.json.consumer.jsonconsumer.listener;

import com.json.consumer.jsonconsumer.model.Payment;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class JsonListener {


    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
    public void antFraud(@Payload Payment payment) {
        log.info("Recebi o pagamento {}", payment.toString());
        Thread.sleep(2000);
        log.info("Validando fraude...");
        Thread.sleep(2000);

        log.info("Compra aprovada ...");
        Thread.sleep(2000);
    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
    public void pdfGenerator(@Payload Payment payment) {
        log.info("Gerando pf... {}", payment.getId());
        Thread.sleep(3000);
    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
    public void sendEmail() {
        Thread.sleep(3000);
        log.info("Enviando email de confirmação...");
    }
}
