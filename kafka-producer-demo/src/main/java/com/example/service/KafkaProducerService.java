package com.example.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.example.dto.KafkaMessage;
import com.example.exception.KafkaProducerException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${app.kafka.topic}")
    private String topicName;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(KafkaMessage message) {
        try {
            CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(
                    topicName,
                    message.getKey(),
                    message.getValue()
            );

            future.whenComplete((result, ex) -> {
                if (ex == null) {
                    log.info("Sent message=[{}] with offset=[{}]", 
                            message.getValue(), 
                            result.getRecordMetadata().offset());
                } else {
                    log.error("Unable to send message=[{}] due to: {}", 
                            message.getValue(), 
                            ex.getMessage());
                }
            });
        } catch (Exception ex) {
            log.error("Error sending message to Kafka: {}", ex.getMessage());
            throw new KafkaProducerException("Error sending message to Kafka", ex);
        }
    }
}