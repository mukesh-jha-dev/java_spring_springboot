package com.example.kafkaproducerconsumer.javaguide.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "my_topic", groupId = "my_group")
	public void consume(String message) {
	    LOGGER.info("Consumed message: {}", message);
	}

}
