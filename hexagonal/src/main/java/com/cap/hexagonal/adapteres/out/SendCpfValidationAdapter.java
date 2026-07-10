package com.cap.hexagonal.adapteres.out;

import com.cap.hexagonal.application.ports.out.SendCpfValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfValidationAdapter implements SendCpfValidationOutputPort {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String Cpf) {
        kafkaTemplate.send("tp-cpf-validation", Cpf);
    }
}
