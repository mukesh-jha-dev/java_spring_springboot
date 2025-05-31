package com.wikimedia_producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wikimedia_producer.producer.WikMediaRecentChangesProducer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class WikimediaProducerApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(WikimediaProducerApplication.class, args);
	}

	@Autowired
	private WikMediaRecentChangesProducer producer;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		producer.sendMessage();
	}
}
