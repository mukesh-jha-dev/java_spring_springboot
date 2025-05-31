package com.example.kafkaproducerconsumer.javaguide.producer;

import org.apache.kafka.common.protocol.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.example.kafkaproducerconsumer.javaguide.pojo.User;

@Service
public class JsonKafkaProducer {

	private static final Logger LOGGER=LoggerFactory.getLogger(JsonKafkaProducer.class);
	@Autowired
	KafkaTemplate<String, User> kt;
	
	public void sendMessage(User data) {
		LOGGER.info("user data is -> %s", data);
		org.springframework.messaging.Message<User> message = MessageBuilder.withPayload(data)
				.setHeader(KafkaHeaders.TOPIC, "my_json_topic").build();
		kt.send( message);
	}
}
