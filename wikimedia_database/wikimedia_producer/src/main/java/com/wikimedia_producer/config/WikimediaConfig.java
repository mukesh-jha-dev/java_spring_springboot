package com.wikimedia_producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaConfig {

	
	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("wikimedia_recentchanges").build();
	}
}
