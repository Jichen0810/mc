package com.capgemini.mc.queue;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = {"tuzisir"})
    public void receiveMessage(ConsumerRecord<?, ?> consumerRecord) {
        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        log.info("Kafka message: ", kafkaMessage);
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            log.info("Message: ", message);
        }
    }
}
