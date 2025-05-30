package com.example.kafkaproducerconsumer.javaguide.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

	public NewTopic topic() {
		return TopicBuilder.name("my_topic").build();
	}
}
