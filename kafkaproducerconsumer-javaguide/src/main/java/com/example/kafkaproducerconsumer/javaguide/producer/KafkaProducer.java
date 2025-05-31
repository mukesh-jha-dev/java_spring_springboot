package com.example.kafkaproducerconsumer.javaguide.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	private static Logger LOGGER=LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	KafkaTemplate<String, String> kt;
	
	public void sendMessage(String message) {
		LOGGER.info(String.format("producer message is -> %s", message));
		System.out.println("Sent message: " + message);
		kt.send("my_topic", message);
	}

}
