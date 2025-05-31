package com.example.kafkaproducerconsumer.javaguide.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.kafkaproducerconsumer.javaguide.pojo.User;

@Service
public class KafkaJsonConsumer {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(KafkaJsonConsumer.class);
	
	
	@KafkaListener(topics="my_json_topic",groupId = "my_group")
	public void consumeJson(User user) {
		LOGGER.info(String.format("consumed  json -> %s", user.toString()));
	}

}
