package com.example.kafkaproducerconsumer.javaguide.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaproducerconsumer.javaguide.pojo.User;
import com.example.kafkaproducerconsumer.javaguide.producer.JsonKafkaProducer;
import com.example.kafkaproducerconsumer.javaguide.producer.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaController {
	@Autowired
	private KafkaProducer kp;
	@Autowired
	private JsonKafkaProducer jsonKafkaProducer;
	
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message){
		kp.sendMessage(message);
		return ResponseEntity.ok("Message Sent to the kafka broker..");
	}
	@PostMapping("/publish_json")
	public ResponseEntity<String> publish(@RequestBody User user){
		jsonKafkaProducer.sendMessage(user);
		return ResponseEntity.ok("Message Sent to the kafka broker..");
	}
}
